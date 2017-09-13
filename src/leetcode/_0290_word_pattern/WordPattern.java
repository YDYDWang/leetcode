package leetcode._0290_word_pattern;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
		System.out.println(new Solution().wordPattern("abba", "dog cat cat fish"));
		System.out.println(new Solution().wordPattern("abba", "dog cat cat dog"));
		System.out.println(new Solution().wordPattern("abba", "dog dog dog dog"));
		System.out.println(new Solution().wordPattern("dog", "dog"));
		System.out.println(new Solution().wordPattern("hut", "unit test harpoon"));
		System.out.println(new Solution().wordPattern("he", "sadsa"));
	}

}
