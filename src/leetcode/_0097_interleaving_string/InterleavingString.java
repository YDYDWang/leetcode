package leetcode._0097_interleaving_string;

public class InterleavingString {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(new Solution().isInterleave("aabcc", "dbbca", "aadbbcbcac")); //true
		System.out.println(new Solution().isInterleave("aabcc", "dbbca", "aadbbbaccc")); //false
		System.out.println(new Solution().isInterleave("", "", "")); //true
		System.out.println(new Solution().isInterleave("", "", "a")); //false
		System.out.println(new Solution().isInterleave("a", "b", "a")); //false
		System.out.println(new Solution().isInterleave("bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa"
				, "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab"
				, "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab")); //false
		System.out.println(System.currentTimeMillis() - start);
	}

}
