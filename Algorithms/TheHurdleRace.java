package sample;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int min = 0, max = 0;
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		max = height[0];
		for (int height_i = 1; height_i < n; height_i++) {
			if (height[height_i] > max) {
				max = height[height_i];
			}
		}
		if (max > k) {
			System.out.println(max - k);
		} else {
			System.out.println(0);
		}
	}

}
