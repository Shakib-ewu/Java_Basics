package day7;

import java.util.Scanner;

public class GCD {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// GCD and LCM
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=num.nextInt();
		
		System.out.println("Enter 2nd number:");
		int n2=num.nextInt();
		
		int num1,num2;
		num1=n1;
		num2=n2;
		
		int rem=0,gcd,lcm;
		
		while(n2!=0) {
			rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		gcd=n1;
		lcm=(num1*num2)/gcd;
		System.out.println("GCD is: " +gcd);
		System.out.println("Lcm is:" +lcm);
	}
	

}
