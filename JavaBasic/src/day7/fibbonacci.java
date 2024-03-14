package day7;

import java.util.Scanner;

public class fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Prompt the user to enter the number of terms for Fibonacci series
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int first=0; int second=1; int fibo=0;
        System.out.print(first+" "+second);
        
        for( int i=3; i<=n; i++) {
            fibo= first+second;
            System.out.print(" "+fibo);
        	first=second;
        	second=fibo;
        }
		
        

        // Generate and display the Fibonacci series
        }

	}

