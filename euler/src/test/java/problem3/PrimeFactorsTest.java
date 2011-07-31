package problem3;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class PrimeFactorsTest {

    @Test
    public void maxPrimeFactor_of2() {
        assertThat(PrimeFactors.generateMax(2), is(2));
    }

    @Test
    public void maxPrimeFactor_of4() {
        assertThat(PrimeFactors.generateMax(4), is(2));
    }

    @Test
    public void maxPrimeFactor_of21() {
        assertThat(PrimeFactors.generateMax(21), is(7));
    }

    @Test
    public void maxPrimeFactor_of13195() {
        assertThat(PrimeFactors.generateMax(13195), is(29));
    }

    @Test
    public void maxPrimeFactor_of4000000() {
        assertThat(PrimeFactors.generateMax(4000000), is(5));
    }
}
