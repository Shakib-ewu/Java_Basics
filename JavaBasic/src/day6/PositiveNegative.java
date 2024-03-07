package day6;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		try (Scanner assig = new Scanner(System.in)) {
			System.out.print("Enter any number :");
			int A= assig.nextInt();
			
			if (A>0) {
			System.out.println("number is positive");
			} else if (A<0) {
				System.out.println("negative number");
			}
else if(A==0){
				System.out.println("zero");
			}
		}

	}

}
