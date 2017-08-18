package leetcode._0636_exclusive_time_of_functions;

import java.util.Iterator;
import java.util.List;

public class Solution {
	public int[] exclusiveTime(int n, List<String> logs) {
		int[] times = new int[n];
		for (int i = 0; i < n; i++) {
			Iterator<String> iterator = logs.iterator();
			while (iterator.hasNext()) {
				times[i] += exclusiveTime(i, i, 0, iterator, 0);
			}
		}
		return times;
	}
	private int exclusiveTime(int lastId, int targetId, int start, Iterator<String> logs, int count) {
		if (!logs.hasNext()) {
			return 0;
		}
		String log = logs.next();
		String[] strings = log.split(":");
		int currentId = Integer.valueOf(strings[0]);
		int currentTime = Integer.valueOf(strings[2]);
		return (count > 0) ? (log.contains("start")) ? ((lastId != targetId && currentId != targetId) || (lastId == targetId && currentId == targetId)) ? (currentId == lastId) ? exclusiveTime(lastId, targetId, start, logs, ++count) : exclusiveTime(lastId, targetId, start, logs, count) : exclusiveTime(currentId, targetId, currentTime, logs, 1) + exclusiveTime(lastId, targetId, start, logs, count) : (currentId == lastId) ? (--count == 0) ? (currentId != targetId) ? -(currentTime - start + 1) : (currentId == targetId) ? currentTime - start + 1 : exclusiveTime(lastId, targetId, start, logs, count) : exclusiveTime(lastId, targetId, start, logs, count) : exclusiveTime(lastId, targetId, start, logs, count) : log.startsWith(targetId + ":start") ?  exclusiveTime(currentId, targetId, currentTime, logs, ++count) : 0;
	}
}