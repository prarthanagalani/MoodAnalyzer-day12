import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.MoodAnalyser;

public class MoodAnalyserTest {


    public void TestHappyMood()
    {     MoodAnalyser mood = new MoodAnalyser("i am in happy mood.");
        assertEquals("Happy",mood.analyseMood());
    } 

    @Test
    public void TestSadMood()
    {     MoodAnalyser mood = new MoodAnalyser("i am in sad mood.");
        assertEquals("Sad",mood.analyseMood());
    } 

    @Test
    public void testNoKeywordMatch() {
       MoodAnalyser mood = new MoodAnalyser("i am in any mood");
       assertEquals("Happy",mood.analyseMood());
    }
}


