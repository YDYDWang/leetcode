package leetcode._0636_exclusive_time_of_functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExclusiveTimeOfFunctions {
	public static String[] PATTERN_1 = {"0:start:0", "1:start:2", "1:end:5", "0:end:6"};
	public static String[] PATTERN_2 = {"0:start:0", "1:start:2", "1:end:5", "2:start:6", "2:end:7", "0:end:9"};
	public static String[] PATTERN_3 = {"0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"};
	public static String[] PATTERN_4 = {"0:start:0", "0:start:2", "1:start:3", "1:end:3", "2:start:4", "2:end:4", "0:end:5", "0:start:6", "0:end:6", "0:end:7"};
	public static String[] PATTERN_5 = {"0:start:0","1:start:5","2:start:6","3:start:9","4:start:11","5:start:12","6:start:14","7:start:15","1:start:24","1:end:29","7:end:34","6:end:37","5:end:39","4:end:40","3:end:45","0:start:49","0:end:54","5:start:55","5:end:59","4:start:63","4:end:66","2:start:69","2:end:70","2:start:74","6:start:78","0:start:79","0:end:80","6:end:85","1:start:89","1:end:93","2:end:96","2:end:100","1:end:102","2:start:105","2:end:109","0:end:114"};
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Arrays.stream(PATTERN_1).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(2, list))); // [3, 4]
		list.clear();
		Arrays.stream(PATTERN_2).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(3, list))); // [4, 4, 2]
		list.clear();
		Arrays.stream(PATTERN_3).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(1, list))); // [8]
		list.clear();
		Arrays.stream(PATTERN_4).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(3, list))); // [6, 1, 1]
		list.clear();
		Arrays.stream(PATTERN_5).forEach(str -> list.add(str));
		System.out.println(Arrays.toString(new Solution().exclusiveTime(8, list))); // [20,14,35,7,6,9,10,14]
	}
}