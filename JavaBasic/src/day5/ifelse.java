package day5;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		try (Scanner assig = new Scanner(System.in)) {
			System.out.print("Enter 1st number :");
			int a=assig.nextInt();
			
			System.out.print("Enter 2nd number :");
			int b=assig.nextInt();
			
			int c=a;
			
			a=b;
			b=c;
			
			
			System.out.println("value of a:" +a);
			System.out.println("value of b:" +b);
		}
		

	}

}
