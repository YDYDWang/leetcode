package leetcode._0347_top_k_frequent_elements;

public class TopKFrequentElements {

	public static void main(String[] args) {
		System.out.println(new Solution().topKFrequent(new int[] {1,1,1,2,2,3}, 2));
		System.out.println(new Solution().topKFrequent(new int[] {1}, 1));
		System.out.println(new Solution().topKFrequent(new int[] {-1, -1}, 1));
	}

}
