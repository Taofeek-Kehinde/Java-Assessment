package test;
import org.junit.jupiter.api.Test;

import static MyTask.AssessmentTwo.sortedNumbers;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestAssessmentTwo {
    @Test

    public void ArrayNumberTest() {
        int[] ActualResult = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] ExpectedResult = new int[] { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };
        int[] result =  sortedNumbers(ActualResult);
        assertArrayEquals(ExpectedResult, result);
    }
}
