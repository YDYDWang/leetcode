package leetcode._0278_First_Bad_Version;

public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		while (start <= end) {
				int middle = start + (end - start) / 2;
				if (isBadVersion(middle)) {
					if (isBadVersion(middle - 1)) {
							end = middle - 1;
					} else {
							return middle;
					}
				} else {
					if (isBadVersion(middle + 1)) {
							return middle + 1;
					} else {
							start = middle + 1;
					}
				}
		}
		return n;
	}
}