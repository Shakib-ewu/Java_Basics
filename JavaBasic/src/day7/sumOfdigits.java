package day7;

import java.util.Scanner;

public class sumOfdigits {

    public static void main(String[] args) {
        // write a program that computes the sum of digits of all integer
        
        try (Scanner value = new Scanner(System.in)) {
            System.out.print("Enter any value:");
            int num = value.nextInt();
            int temp = 0, r, sum = 0;
            temp = num;
            
            while (temp != 0) {
                // temp=num; this initialization will be in out of loop otherwise result will be >>the result of sum
                r = temp % 10;
                sum = sum + r;
                temp = temp / 10;
                
            }
            System.out.println("sum of digit is:" + sum);
        }
    }
}