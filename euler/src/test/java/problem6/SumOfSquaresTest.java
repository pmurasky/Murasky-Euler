package problem6;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SumOfSquaresTest {

	@Test
	public void sumOfSquares1To10() {
		assertThat(SumOfSquares.sum(10), is(385));
	}
	
	@Test
	public void sumOfTo10Squared() {
		assertThat(SumOfSquares.sumSquared(10), is(3025));
	}
	
	@Test
	public void differenceOfSumsfor10() {
		assertThat(SumOfSquares.differenceOfSums(10), is(2640));
	}
	
	@Test
	public void differenceOfSumsfor100() {
		assertThat(SumOfSquares.differenceOfSums(100), is(25164150));
	}

}
