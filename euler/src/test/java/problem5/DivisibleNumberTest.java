package problem5;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DivisibleNumberTest {

    @Test
    public void smallestNumberDivisbleBy1() {
        assertThat(DivisbleNumber.generate(1), is(1));
    }

    @Test
    public void smallestNumberDivisbleBy1And2() {
        assertThat(DivisbleNumber.generate(2), is(2));
    }

    @Test
    public void smallestNumberDivisbleBy1And2And3() {
        assertThat(DivisbleNumber.generate(3), is(6));
    }

    @Test
    public void smallestNumberDivisbleBy1To10() {
        assertThat(DivisbleNumber.generate(10), is(2520));
    }

    @Test
    public void smallestNumberDivisbleBy1To20() {
        assertThat(DivisbleNumber.generate(20), is(232792560));
    }
}
