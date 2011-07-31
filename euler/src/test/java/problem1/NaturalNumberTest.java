package problem1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class NaturalNumberTest {

    @Test
    public void sumOfNumbersMultipleOf3And5_equal23_for10() throws Exception {
        NaturalNumber naturalNumber = new NaturalNumber(10);
        assertThat(naturalNumber.getSum(), is(23));
    }

    @Test
    public void sumOfNumbersMultipleOf3And5_equal23_for20() throws Exception {
        NaturalNumber naturalNumber = new NaturalNumber(20);
        assertThat(naturalNumber.getSum(), is(78));
    }

    @Test
    public void sumOfNumbersMultipleOf3And5_equal23_for1000() throws Exception {
        NaturalNumber naturalNumber = new NaturalNumber(1000);
        assertThat(naturalNumber.getSum(), is(233168));
    }
}
