package leetcode._0303_range_sum_query_immutable;

public class RangeSumQueryImmutable {

	public static void main(String[] args) {
		NumArray obj = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
		System.out.println(obj.sumRange(0, 2)); // 1
		System.out.println(obj.sumRange(2, 5)); // -1
		System.out.println(obj.sumRange(0, 5)); // -3
		System.out.println(obj.sumRange(10, 10)); // 0
		System.out.println(obj.sumRange(0, 10)); // -3
	}

}
