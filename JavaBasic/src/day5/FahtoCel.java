package day5;

import java.util.Scanner;

public class FahtoCel {

	public static void main(String[] args) {
		try (Scanner assig = new Scanner(System.in)) {
			System.out.print("Farenheight temperature :");
			double F= assig.nextDouble();
			
			double C =(F-32)*5/9;
			
			System.out.println("Celcius temperature is: " +C);
		}

	}

}
