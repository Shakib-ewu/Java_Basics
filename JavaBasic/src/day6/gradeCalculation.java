package day6;

import java.util.Scanner;

public class gradeCalculation {

	public static void main(String[] args) {
		try (Scanner grades = new Scanner(System.in)) {
			System.out.println("Put you marks:");
			@SuppressWarnings("unused")
			int marks=grades.nextInt();
			
			if(marks>90){
				System.out.println("You obtained: A" +marks);
				
			}
			else if(marks>75) {
				System.out.println("You obtained: B " +marks);
			}
			else if(marks>60) {
				System.out.println("You obtained: C " +marks);
			}
			else if(marks>30) {
				System.out.println("You obtained: C " +marks);
			}else {
				System.out.println("You obtained: F " +marks);
			}
		}
		
		
				

	}

}
