package sample;

import java.util.Scanner;

public class SuperReducedString {

	public static void main(String[] args) {
		int as = 0, i = 0;
		Scanner scanner=new Scanner(System.in);
		String string= scanner.next();
		for (i = 0; i < string.length() && (as + 1) < string.length(); i++) {
			if (string.charAt(i) == string.charAt(as + 1)) {
				string = string.replace(string.substring(i, as + 2), "");
				if (i >= 0) {
					i = -1;
				}
				as = 0;
			} else {
				as = as + 1;
			}
		}
		if(string.equals(""))
		{
			System.out.println("Empty String");
		}
		else
		{
			System.out.println(string);
		}
		
	}

}
