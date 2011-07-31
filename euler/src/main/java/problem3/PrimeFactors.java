package problem3;

public class PrimeFactors {

    public static Integer generateMax(int n) {
        int maxPrimeFactor = 0;

        for (int candidate = 2; n > 1; candidate++) {
            for (; n % candidate == 0; n /= candidate) {
                maxPrimeFactor = candidate;
            }
        }

        return maxPrimeFactor;
    }
}
