package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class JavaAnagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toLowerCase();
		String s1 = sc.next();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);
		String s2 = new String(ch);
		String s3 = new String(ch1);

		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

		String text = "He is a very very good boy, isn't he?";
		StringTokenizer st = new StringTokenizer(text, " !,?._'@");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		try {
			Pattern p = Pattern.compile("([A-Z])(.+)");
			if (p.pattern() != null) {
				System.out.println(p.pattern());
			}
		} catch (Exception e) {
			System.out.println("Invalid");
		}

		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int a = 0, b = 0;
		if (a0 > b0) {
			a++;
		}
		if (a1 > b1) {
			a++;
		}
		if (a2 > b2) {
			a++;
		}
		if (a0 < b0) {
			b++;
		}
		if (a1 < b1) {
			b++;
		}
		if (a2 < b2) {

			b++;
		}
		System.out.print(a + " " + b);
		
	}

}
