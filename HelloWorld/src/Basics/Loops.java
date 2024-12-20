package Basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
		sc.close();

	}

}
