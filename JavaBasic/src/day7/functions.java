package day7;


public class functions {
	//Write a function that are divisor by all it's number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         allDivisors(30);
	}
  static void allDivisors(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}

}
