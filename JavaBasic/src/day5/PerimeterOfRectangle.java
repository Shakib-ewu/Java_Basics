package day5;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner assig=new Scanner(System.in);
		System.out.print("1st number : ");
		int a= assig.nextInt();
		System.out.print("2nd number : ");
		int b= assig.nextInt();
		System.out.print("3rd number : ");
		int c= assig.nextInt();
		System.out.print("4th number : ");
		int d= assig.nextInt();
		
		int Perimeter=a+b+c+d;
		System.out.println("Result is: " +Perimeter +"cm");
		

	}

}
