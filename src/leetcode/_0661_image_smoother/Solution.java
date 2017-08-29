package leetcode._0661_image_smoother;

class Solution {

	public int[][] imageSmoother(int[][] M) {
		int rowLength = M.length;
		if (rowLength >= 2) {
			int colLength = M[0].length;
			int [][] newM = new int[rowLength][colLength];
			for (int i = 0; i < rowLength; i++) {
				for (int j = 0; j < colLength; j++) {
					if (i == 0 && j == 0) {
						if (j + 1 < colLength) {
							newM[0][0] = (M[0][0] + M[0][1] + M[1][0] + M[1][1]) / 4;
						} else {
							newM[0][0] = (M[0][0] + M[1][0]) / 2;
						}
					} else if (i == 0 && j == colLength - 1) {
						newM[0][j] = (M[0][j] + M[0][j - 1] + M[1][j] + M[1][j - 1]) / 4;
					} else if (i == rowLength - 1 && j == 0) {
						if (j + 1 < colLength) {
							newM[i][0] = (M[i][0] + M[i][1] + M[i - 1][0] + M[i - 1][1]) / 4;
						} else {
							newM[i][0] = (M[i][0] + M[i - 1][0]) / 2;
						}
					} else if (i == rowLength - 1 && j == colLength - 1) {
						newM[i][j] = (M[i][j] + M[i][j - 1] + M[i - 1][j] + M[i - 1][j - 1]) / 4;
					} else if (i == 0) {
						newM[0][j] = (M[0][j - 1] + M[0][j] + M[0][j + 1]
								+ M[1][j - 1] + M[1][j] + M[1][j + 1]) / 6;
					} else if (i == rowLength - 1) {
						newM[i][j] = (M[i][j - 1] + M[i][j] + M[i][j + 1]
								+ M[i - 1][j - 1] + M[i - 1][j] + M[i - 1][j + 1]) / 6;
					} else if (j == 0) {
						if (j + 1 < colLength) {
							newM[i][0] = (M[i - 1][0] + M[i][0] + M[i + 1][0]
									+ M[i - 1][1] + M[i][1] + M[i + 1][1]) / 6;
						} else {
							newM[i][0] = (M[i - 1][0] + M[i][0] + M[i + 1][0]) / 3;
						}
					} else if (j == colLength - 1) {
						newM[i][j] = (M[i - 1][j] + M[i][j] + M[i + 1][j]
								+ M[i - 1][j - 1] + M[i][j - 1] + M[i + 1][j - 1]) / 6;
					} else {
						newM[i][j] = (M[i - 1][j - 1] + M[i - 1][j] + M[i - 1][j + 1]
								+ M[i][j - 1] + M[i][j] + M[i][j + 1]
								+ M[i + 1][j - 1] + M[i + 1][j] + M[i + 1][j + 1]) / 9;
					}
				}
			}
			return newM;
		} else if (rowLength == 1) {
			int colLength = M[0].length;
			int [][] newM = new int[rowLength][colLength];
			for (int i = 0; i < colLength; i++) {
				if (i == 0) {
					if ((i + 1) < colLength) {
						newM[0][0] = (M[0][0] + M[0][1]) / 2;
					} else {
						newM[0][0] = M[0][0];
					}
				} else if (i == colLength - 1) {
					newM[0][i] = (M[0][i] + M[0][i - 1]) / 2;
				} else {
					newM[0][i] = (M[0][i + 1] + M[0][i] + M[0][i - 1]) / 3;
				}
			}
			return newM;
		}
		return M;
	}

}