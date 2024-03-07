package day6;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner assig=new Scanner(System.in);
		System.out.print("Enter any year :");
		int year= assig.nextInt();
		
		if (year%4==0 && year%400==0) {
			System.out.println("Leap year: " +year);
		} 
		else if(year%100==0) {
			//System.out.println("Thanks not a leap year");
		}
	
		else
		{
			System.out.println("Thanks not a leap year");
		}

	}

}
