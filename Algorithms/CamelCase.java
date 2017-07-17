package sample;

import java.util.Scanner;

//camel case
public class CamelCase {

	public static void main(String[] args) {
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i))) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}
