package problem3;

import java.math.BigInteger;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class PrimeFactorsTest {

    @Test
    public void maxPrimeFactor_of2() {
        assertThat(PrimeFactors.generateMax(2L), is(2L));
    }

    @Test
    public void maxPrimeFactor_of4() {
        assertThat(PrimeFactors.generateMax(4L), is(2L));
    }

    @Test
    public void maxPrimeFactor_of21() {
        assertThat(PrimeFactors.generateMax(21L), is(7L));
    }

    @Test
    public void maxPrimeFactor_of13195() {
        assertThat(PrimeFactors.generateMax(13195L), is(29L));
    }

    @Test
    public void maxPrimeFactor_of4000000() {
        assertThat(PrimeFactors.generateMax(4000000L), is(5L));
    }
    
    @Test
    public void maxPrimeFactor_600851475143(){
        assertThat(PrimeFactors.generateMax(600851475143L), is(6857L));
    }
}
