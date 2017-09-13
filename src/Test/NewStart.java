package Test;

import java.util.Scanner;

public class NewStart {
	public static void main(String[] args) {

		String a;
		String c = null;
		String the = "THE";
		String bork = ". Bork Bork Bork!";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		a = scanner.nextLine().toUpperCase();
		System.out.println(convert(a) + bork);
	}

	public static String convert(String a) {
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;
		String g = null;
		String h = null;
		String j = null;
		int i = a.indexOf("THE");
		b = a.replace(a.substring(i, i + 3), "ZEE");
		return b;
	}
}
