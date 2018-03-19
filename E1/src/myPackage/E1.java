package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program stores the values of two sets of integers
 * Then it prints each set and their union
 *
 * @author daono
 *@version 1
 */

public class E1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a= 0;
		int b = 0;

		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		ArrayList<Integer> lst2 = new ArrayList<Integer>();

		do {
			System.out.println("Type any number you want. When you are done, hit 0");
			b = scan.nextInt();
			if (b == 0)
				break;
			if (a!= b) {
				lst1.add(b);
			}
			a= b;
		} while (true);
		do {
			System.out.println("Type any number you want. When you are done, hit 0.");
			b = scan.nextInt();
			if (b == 0)
				break;
			if (a!= b) {
				lst2.add(b);
			}
			a= b;
		} while (true);
		if (lst1.size() != 0) {
			for (int i : lst1) {
				System.out.print(i + " ");
			}
		}
		if (lst2.size() != 0) {
			for (int i : lst2) {
				System.out.print(i + " ");
			}
		}
		if (lst1.size() == 0 && lst2.size() == 0) {
			System.out.println("vide");
			System.exit(0);
		} else {
			for (int i : lst2)
				if (!lst1.contains(i))
					lst1.add(i);
		}
		for (int i : lst1) {
			System.out.print(i + " ");
		}
		scan.close();

	}
}
