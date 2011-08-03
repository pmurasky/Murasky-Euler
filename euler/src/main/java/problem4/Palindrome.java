package problem4;

import org.apache.commons.lang.StringUtils;

public class Palindrome {

	private int numberOfDigits;

	public boolean isPalindrome(int i) {
		String number = Integer.toString(i);
		String reverseNumber = StringUtils.reverse(number);
		if (number.equals(reverseNumber)){
			return true;
		}
		return false;
	}

	public int largestPalindromeProduct() {
		int product = 0;
		int currentProduct = 0;
		for(int digit1 = determineStartingDigit(); digit1 >=0; digit1--){
			for(int digit2 = determineStartingDigit(); digit2 >=0; digit2--){
				product = digit1 * digit2;
				if (isPalindrome(product)){
					currentProduct = isCalculatedProductGreaterThanCurrentProduct(
							product, currentProduct);
					break;
				}
			}
		}
		return currentProduct;
	}

	private int isCalculatedProductGreaterThanCurrentProduct(int product,
			int maxProduct) {
		if(product > maxProduct){
			maxProduct = product;
		}
		return maxProduct;
	}
	
	public void setNumberOfDigits(int numberOfDigits) {
		this.numberOfDigits = numberOfDigits;
	}
	
	private int determineStartingDigit(){
		if(numberOfDigits==2){
			return 100;
		}
		return 1000;
	}
}
