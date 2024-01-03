import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.MoodAnalyser;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void testHappyMood() {

        String result = moodAnalyser.analyseMood("I am feeling happy today");
        assertEquals("Happy", result);
    }

    @Test
    public void testSadMood() {

        String result = moodAnalyser.analyseMood("I feel sad right now");
        assertEquals("Sad", result);
    }

    @Test
    public void testNoKeywordMatch() {

        String result = moodAnalyser.analyseMood("I am in any mood.");
        assertEquals("Happy", result);
    }
}
