package leetcode._0475_heaters;

import java.util.Arrays;

class Solution {
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int index = 0;
		int radius = 0;
		for (int i = 0; i < heaters.length; i++) {
			if (i == heaters.length - 1) {
				break;
			}
			int bound = (heaters[i + 1] + heaters[i]) / 2;
			for (;index < houses.length; index++) {
				int house = houses[index];
				if (house > bound) {
					break;
				} else if ((house - heaters[i]) > radius) {
					radius = house - heaters[i];
				} else if ((heaters[i] - house) > radius) {
					radius = heaters[i] - house;
				}
			}
		}
		int heater = heaters[heaters.length - 1];
		for (;index < houses.length; index++) {
			int house = houses[index];
			if ((house - heater) > radius) {
				radius = house - heater;
			} else if ((heater - house) > radius) {
				radius = heater - house;
			}
		}
		return radius;
	}
}