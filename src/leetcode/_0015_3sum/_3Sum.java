package leetcode._0015_3sum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class _3Sum {
	private static int[] sample1;
	public static long start = 0;

	public static void main(String[] args) throws IOException {
		initSample1();
		start = System.currentTimeMillis();
		System.out.println(new Solution().threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
		System.out.println(new Solution().threeSum(new int[] {0, 0, 0}));
		System.out.println(new Solution().threeSum(new int[] {1, 2, -2, -1}));
		System.out.println(new Solution().threeSum(new int[] {-1, 0, 1}));
		System.out.println(new Solution().threeSum(new int[] {3,0,-2,-1,1,2}));
		System.out.println(new Solution().threeSum(new int[] {-1,0,1,2,-1,-4}));
		System.out.println(new Solution().threeSum(new int[] {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}));
		System.out.println(new Solution().threeSum(new int[] {0, 0}));
		System.out.println(new Solution().threeSum(sample1));
		System.out.println(System.currentTimeMillis() - start);
	}

	private static void initSample1() throws IOException {
		sample1 = Arrays.stream(Files.readAllLines(Paths.get("D:\\123.txt"))
				.get(0)
				.split(","))
				.mapToInt(s -> Integer.valueOf(s))
				.toArray();
	}

}
