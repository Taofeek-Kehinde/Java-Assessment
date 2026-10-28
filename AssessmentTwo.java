package MyTask;
import java.util.Arrays;

public class AssessmentTwo {

    public static int[] sortedNumbers(int[] numbers) {
        int[] sortedNumbers = new int[numbers.length];

        for ( int index = 0; index < numbers.length; index++ ) {
            sortedNumbers[index] = numbers[index] *  numbers[index];
        }

        Arrays.sort(sortedNumbers);

        return sortedNumbers;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(sortedNumbers(numbers)));
    }

}
