package Array;

import java.util.Scanner;

public class sumOfarray {

	public static void main(String[] args) {
		// SumOgarray
		
		Scanner input=new Scanner(System.in);
		//int input= assig.nextInt();
		
		float[]number =new float[10];
		float sum=0;
		
		System.out.println("Enter five number:");
		for(int i=0;i<5;i++) {
			number[i]=input.nextFloat();
		}
		for(int i=0;i<number.length;i++) {
			sum=sum+number[i];
		}
		
		System.out.println("Total sum is: " +sum);
	}

}
