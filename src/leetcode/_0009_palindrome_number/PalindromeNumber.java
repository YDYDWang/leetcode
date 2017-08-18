package leetcode._0009_palindrome_number;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome(-2147483648)); // false
		System.out.println(new Solution().isPalindrome(-123321)); // false
		System.out.println(new Solution().isPalindrome(123321)); // true
		System.out.println(new Solution().isPalindrome(12321)); // true
		System.out.println(new Solution().isPalindrome(-12321)); // false
		System.out.println(new Solution().isPalindrome(100)); // false
	}

}
