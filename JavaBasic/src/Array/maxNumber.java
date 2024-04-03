package Array;

import java.util.Scanner;

public class maxNumber {

	public static void main(String[] args) {
		// Finding a mximum number
		
		Scanner input=new Scanner(System.in);
		
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
		
		 double max=number[0];
		 for (int i=1;i<5;i++) {
			 if(number[i]>max) {
				 max=number[i];
			 }
		 }
		 System.out.println("Max number is: "+max);
	}

	}

