package day7;

import java.util.Scanner;

public class SumofAllodd {

	public static void main(String[] args) {
		// create a program to sum of all odd numbers from 1 to a specific number n
		
		Scanner value = new Scanner(System.in) ;
			System.out.print("Enter any value:");
			int num= value.nextInt();
			int sum = 0;
			for (int i=1;i<=num;i++) {
				if(i%2!=0) {
				   sum=sum+i;
					//System.out.println("total sum of odd number is:" +sum);
				}
				
			}
			System.out.println("total sum of odd number is:" +sum);
		
		

	}

}
