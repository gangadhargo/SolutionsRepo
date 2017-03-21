package sample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {
	static int i = 0;
	static int j = 1;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int count = 0;
		Set set = new HashSet();
		for (int a : c) {
			if (set.contains(a)) {
				count = count + 1;
				set.remove(a);
			} else {
				set.add(a);
			}
		}
		System.out.println(count);
		System.out.println(set);
		/*
		 * int count = 1, mp = 0; Arrays.sort(c); for (i = 0; i < c.length; i++)
		 * { for (; j < c.length; j++) { if (c[i] == c[j]) { count = count + 1;
		 * } else { i = j - 1; j = j + 1; break; } } mp = mp + count / 2; count
		 * = 0; } System.out.println(mp);
		 */
	}
}
