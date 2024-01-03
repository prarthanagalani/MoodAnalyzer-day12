import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.MoodAnalysisException;

import org.example.MoodAnalyser;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser;

    @BeforeEach
    public void setUp() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    public void testHappyMood() throws MoodAnalysisException {
        moodAnalyser = new MoodAnalyser("I am feeling happy today");
        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);
    }

    @Test
    public void testSadMood() throws MoodAnalysisException {
        moodAnalyser = new MoodAnalyser("I feel sad right now");
        String result = moodAnalyser.analyseMood();
        assertEquals("Sad", result);
    }

    @Test
    public void testNoKeywordMatch() throws MoodAnalysisException {
        moodAnalyser = new MoodAnalyser("I am in any mood.");
        String result = moodAnalyser.analyseMood();
        assertEquals("Happy", result);
    }

    @Test
    public void testNullMessage() {
        moodAnalyser = new MoodAnalyser(null);
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalyser.analyseMood();
        });
        assertEquals(MoodAnalyser.Error.NULL, exception.getError());
    }

    @Test
    public void testEmptyMessage() {
        moodAnalyser = new MoodAnalyser("");
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalyser.analyseMood();
        });
        assertEquals(MoodAnalyser.Error.EMPTY, exception.getError());
    }
}
