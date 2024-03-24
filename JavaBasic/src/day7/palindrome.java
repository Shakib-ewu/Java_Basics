package day7;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// palindrome number
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=num.nextInt();
		
		int r,sum=0;
		int temp=n;
		
		while(temp!=0) {
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println("palindrome number is:" +sum);
		}else
			System.out.println("Not a palindrome");
		

	}

}
