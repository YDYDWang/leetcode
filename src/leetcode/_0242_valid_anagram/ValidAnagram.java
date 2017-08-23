package leetcode._0242_valid_anagram;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(new Solution().isAnagram("anagram", "nagaram")); //true
		System.out.println(new Solution().isAnagram("rat", "car")); //false
		System.out.println(new Solution().isAnagram("", "")); //true
		System.out.println(new Solution().isAnagram("ac", "bb")); //false
	}

}
