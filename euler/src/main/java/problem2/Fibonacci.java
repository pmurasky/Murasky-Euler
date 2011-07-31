package problem2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> generateSequence(int sequenceValuePoint) {
        List<Integer> numbers = new ArrayList<Integer>();
        int previousValue = 1;
        int currentValue = 2;

        numbers.add(previousValue);
        numbers.add(currentValue);
        do {
            int calculatedValue = previousValue + currentValue;
            if (calculatedValue >= sequenceValuePoint) {
                break;
            }
            numbers.add(calculatedValue);
            previousValue = currentValue;
            currentValue = calculatedValue;

        } while (currentValue < sequenceValuePoint);
        return numbers;
    }

    public static int sumOfEvenNumbers(int sequenceValuePoint) {
        List<Integer> numbers = generateSequence(sequenceValuePoint);
        int sum = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sum = sum + n;
            }
        }
        return sum;
    }
}
