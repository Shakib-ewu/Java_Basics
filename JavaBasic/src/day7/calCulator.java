package day7;

import java.util.Scanner;

public class calCulator {
	//create a program to calculate all implementation using a function

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner value = new Scanner(System.in)) {
			System.out.print("Enter any value of x and y :");
			int x= value.nextInt();
			int y= value.nextInt();
			
			int sum=multiply(x,y);
			System.out.println("resut: " + sum);
		}

	}
	
	public static int add(int x,int y) {
		@SuppressWarnings("unused")
		int result=x+y;
		return result;
		
	}
	public static int subtract(int x,int y) {
		@SuppressWarnings("unused")
		int result=x-y;
		return result;

}
	public static int multiply(int x,int y) {
		@SuppressWarnings("unused")
		int result=x*y;
		return result;
		
	}
	public static int divide(int x,int y) {
		@SuppressWarnings("unused")
		int result=x/y;
		return result;
		
	}
	
}
