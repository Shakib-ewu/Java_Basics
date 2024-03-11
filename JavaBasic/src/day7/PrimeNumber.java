package day7;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Write a program check if a given number is prime or not
		
		try (Scanner value = new Scanner(System.in)) {
			System.out.print("Enter any value:");
			int num= value.nextInt();
			int count=0;
			
			if (num==0 && num==1) {
				System.out.println("Not a prime number");
			} else {
				for(int i=2 ;i<num;i++)
				{
					if(num%2==0) {
						count++;
						break;
					}
				}
				if(count==0) {
					System.out.println("Prime number");
				}else {
					System.out.println("Not a prime number");
				}
			}
		}
	}

}
