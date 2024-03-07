package day6;

import java.util.Scanner;

public class ageGroupCategories {

	public static void main(String[] args) {
		Scanner ages=new Scanner(System.in);
		System.out.println("Enter any age:");
		int age=ages.nextInt();
		
		if(age>=60) {
			System.out.println("Senior:" +age);
		}
		else if(age<60 && age>=20) {
			System.out.println("Adult:"+age);
		}
		else if(age<20 && age>=13) {
			System.out.println("Teen:"+age);
		}
		else if(age<13) {
			System.out.println("Child:" +age);
		}
	}

}
