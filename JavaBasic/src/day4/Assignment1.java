package day4;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner assig=new Scanner(System.in);
		//id,title,price,description,category
		System.out.print("Enter Your id :");
		int id=assig.nextInt();
		
		System.out.println("Enter Your Title :");
		String title=assig.next();
		
		System.out.println("Enter Your price :");
		Float price=assig.nextFloat();
		
		System.out.println("Enter Your description :");
		String description=assig.next();
		
		System.out.println("Enter Your category :");
		String category=assig.next();
		
		System.out.println("Product id is:" + id);
		System.out.println("Product title:" + title);
		System.out.println("Product price:" + price);
		System.out.println("Product description:" + description);
		System.out.println("Product category:"+ category);

	}

}
