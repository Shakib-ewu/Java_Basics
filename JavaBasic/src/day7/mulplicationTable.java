package day7;

import java.util.Scanner;

public class mulplicationTable {
	//Develop a program that prints the multiplication table for a given number

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner value = new Scanner(System.in)) {
			System.out.print("Enter any value:");
			int num= value.nextInt();
			for(int i=1;i<=10;i++) {
				int result=num*i;
				System.out.println(num+ " x " +i+ " = "+result);
				
			}
		}
		
		
		

	}

}
