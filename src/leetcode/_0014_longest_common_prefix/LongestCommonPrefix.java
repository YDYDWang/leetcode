package leetcode._0014_longest_common_prefix;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		System.out.println(new Solution().longestCommonPrefix(new String[0])); // ""
		System.out.println(new Solution().longestCommonPrefix(new String[] {"a", "b"})); // ""
		System.out.println(new Solution().longestCommonPrefix(new String[] {"aa", "a"})); // "a"
		System.out.println(new Solution().longestCommonPrefix(new String[] {"c", "c"})); // "c"
		System.out.println(new Solution().longestCommonPrefix(new String[] {"aa", "ab"})); // "a"
	}
}
