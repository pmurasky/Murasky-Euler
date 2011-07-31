package problem1;

import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {

    private static int maxNumber = 0;
    private List<Integer> numbers;

    public NaturalNumber(int num) {
        numbers = new ArrayList<Integer>();
        maxNumber = num;
    }

    public Integer getSum() {
        int total = 0;
        getNumbersMultipleOfThree();
        getNumbersMultipleOfFive();

        for (int n : numbers) {
            total = total + n;
        }
        return total;
    }

    private List<Integer> getNumbersMulipleOf(int multipler) {
        for (int n = 0; n < maxNumber; n++) {
            if (n % multipler == 0) {
                if (n > 0 && numbers.contains(n) == false) {
                    numbers.add(n);
                }
            }
        }
        return numbers;
    }

    private List<Integer> getNumbersMultipleOfFive() {
        return getNumbersMulipleOf(5);
    }

    private List<Integer> getNumbersMultipleOfThree() {
        return getNumbersMulipleOf(3);
    }
}
