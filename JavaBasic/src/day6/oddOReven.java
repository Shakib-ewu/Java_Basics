package day6;

import java.util.Scanner;

public class oddOReven {

	public static void main(String[] args) {
		try (Scanner assig = new Scanner(System.in)) {
			System.out.print("Enter any number :");
			@SuppressWarnings("unused")
			int num= assig.nextInt();
			
			if (num%2==0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}
		}
	}

}