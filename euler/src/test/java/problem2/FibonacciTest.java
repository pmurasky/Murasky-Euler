package problem2;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void generateSequenceBelow5() {
        assertThat(Fibonacci.generateSequence(5), is(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void sumOfSequenceBelow50_44_forEvenNumbers() throws Exception {
        assertThat(Fibonacci.sumOfEvenNumbers(50), is(44));
    }

    @Test
    public void sumOfSequenceBelow4000000_forEvenNumbers() throws Exception {
        assertThat(Fibonacci.sumOfEvenNumbers(4000000), is(4613732));
    }
}
