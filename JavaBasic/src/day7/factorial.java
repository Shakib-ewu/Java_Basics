package day7;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// write a function that calculates a factorial
		
		Scanner value = new Scanner(System.in) ;
		System.out.print("Enter any value:");
		int num= value.nextInt();
		int fact=factorial(num);
		System.out.println("Factorial of " + num + " is:" +fact);
	}
	
	public static int factorial(int num) {
		int fact=1;
		for(int i=num;i>0;i--) {
		  fact=fact*i;
		}
		return fact;
	
}

}
