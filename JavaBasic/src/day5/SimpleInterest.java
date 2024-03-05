package day5;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		try (Scanner assig = new Scanner(System.in)) {
			System.out.print("P :");
			double P= assig.nextDouble();
			System.out.print("T :");
			double T= assig.nextDouble();
			System.out.print("R :");
			double R= assig.nextDouble();
			
			double Simpleinterest= (P*T*R)/100;
			System.out.println("Simple Interest is: " +Simpleinterest);
		}
		
	}

}
