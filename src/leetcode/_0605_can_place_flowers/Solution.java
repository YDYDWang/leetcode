package leetcode._0605_can_place_flowers;

class Solution {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		int temp = 0;
		int i = 0;
		if (flowerbed.length > 0 && flowerbed[0] == 0) {
			for (; i < flowerbed.length; i++) {
				int num = flowerbed[i];
				if (num == 1) {
					if (temp >= 2) {
						count += temp / 2;
					}
					temp = 0;
					break;
				} else {
					temp++;
				}
			}
			if (temp > 0) {
				count += (temp - 1) / 2 + 1;
				temp = 0;
			}
		}
		for (; i < flowerbed.length; i++) {
			int num = flowerbed[i];
			if (num == 1) {
				if (temp >= 3) {
					count += (temp - 1) / 2;
				}
				temp = 0;
			} else {
				temp++;
			}
		}
		if (temp >= 2) {
			count += temp / 2;
		}
		if (count >= n) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}