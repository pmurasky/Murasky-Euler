package problem4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
	
	 private Palindrome palindrome;
	 
	@Before
	public void setUp(){
		palindrome = new Palindrome();
	}

    @Test
    public void notPalindromeNumber() {
        assertThat(palindrome.isPalindrome(9876), is(false));
    }
    
    @Test
    public void isPalindromeNumber(){
    	assertThat(palindrome.isPalindrome(1331), is(true));
	}
    
    @Test
	public void  largestPalindromeMadeFromProductOfTwo2Digit(){
    	palindrome.setNumberOfDigits(2);
		assertThat(palindrome.largestPalindromeProduct(), is(9009));
	}
    
    @Test
	public void  largestPalindromeMadeFromProductOfTwo3Digit(){
    	palindrome.setNumberOfDigits(3);
		assertThat(palindrome.largestPalindromeProduct(), is(906609));
	}
    
}
