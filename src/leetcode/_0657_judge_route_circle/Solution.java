package leetcode._0657_judge_route_circle;

class Solution {
	public boolean judgeCircle(String moves) {
		if ((moves.length() & 1) == 0) {
			int vertical = 0;
			int horizon = 0;
			for (int i = 0; i < moves.length(); i++) {
				switch (moves.charAt(i)) {
					case 'U':
						vertical++;
						break;
					case 'D':
						vertical--;
						break;
					case 'R':
						horizon++;
						break;
					case 'L':
						horizon--;
						break;
				}
			}
			if (vertical == 0 && horizon == 0) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
}