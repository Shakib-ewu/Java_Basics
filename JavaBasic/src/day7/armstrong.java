package day7;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// Armstrong number
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n1=num.nextInt();
		int r,temp=n1,sum=0;
		
		
		while(temp!=0) {
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(n1==sum) {
			System.out.println("Armstrong number:" +sum);
		}else
			System.out.println("Not armstrong");
		

	}

	}

