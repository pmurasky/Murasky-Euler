package problem3;

public class PrimeFactors {

    public static Long generateMax(long n) {
        long maxPrimeFactor = 0;

        for (long candidate = 2; n > 1; candidate++) {
            for (; n % candidate == 0; n /= candidate) {
                maxPrimeFactor = candidate;
            }
        }

        return maxPrimeFactor;
    }
}
