package leetcode._0383_ransom_note;

public class RansomNote {

	public static void main(String[] args) {
		System.out.println(new Solution().canConstruct("@@A", "@@B"));
		System.out.println(new Solution().canConstruct("@@A", "A@@"));
		System.out.println(new Solution().canConstruct("", ""));
	}

}
