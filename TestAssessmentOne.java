package test;
import org.junit.jupiter.api.Test;
import MyTask.AssessmentOne;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAssessmentOne {
    @Test
    public void WordTest() {
        AssessmentOne assessment = new AssessmentOne();
        String words = " My name is Taofeek Kehinde I'm a student of Semicolon";
        String expectedResult = "a";
        String actualResult = assessment.Word(words);
        assertEquals(expectedResult, actualResult);

    }

}
