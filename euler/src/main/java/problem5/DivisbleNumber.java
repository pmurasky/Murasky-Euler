package problem5;

public class DivisbleNumber {

    public static Integer generate(int numberLimit) {
        boolean allNumbersNotDivisible = true;
        int smallestDivisibleNumber = 1;
        while (allNumbersNotDivisible) {
            allNumbersNotDivisible = false;
            for (int i = 1; i <= numberLimit; i++) {
                if (smallestDivisibleNumber % i != 0) {
                    allNumbersNotDivisible = true;
                    break;
                }
            }
            if (allNumbersNotDivisible) {
                smallestDivisibleNumber++;
            }
        }
        return smallestDivisibleNumber;
    }
}
