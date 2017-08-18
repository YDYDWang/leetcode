package leetcode._0020_valid_parentheses;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(new Solution().isValid("["));
		System.out.println(new Solution().isValid("[]"));
		System.out.println(new Solution().isValid("([])"));
		System.out.println(new Solution().isValid("([)(])"));
	}

}
