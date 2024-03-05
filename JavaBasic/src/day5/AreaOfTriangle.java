package day5;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner assig=new Scanner(System.in);
		System.out.print("1st number :");
		double B= assig.nextDouble();
		System.out.print("2nd number :");
		double H= assig.nextDouble();
		double areaOfRec=0.5*B*H;
		
		System.out.println("Area of triangle is: " +areaOfRec+ "cms2");

	}

}
