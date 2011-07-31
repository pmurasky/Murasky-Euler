package problem6;

public class SumOfSquares {

	public static int sum(int i) {
		int sum = 0;
		for (int num = 1; num <= i; num++){
			sum += Math.pow(num, 2);
		}
		return sum;
	}

	public static int sumSquared(int i) {
		int sum = 0;
		for (int num = 1; num <= i; num++){
			sum += num;
		}
		return (int) Math.pow(sum, 2);
	}

	public static int differenceOfSums(int i) {
		return sumSquared(i)-sum(i);
	}

}
