package day7;

public class loopFunctions {

	public static void main(String[] args) {
		int sum=0;
		for(int i=30; i<=120; i++) {
			if(i%3==0 && i%5==0) {
				sum=sum+i;
				//
			}
			
		}
		System.out.println("Sum is: " +sum);

	}

}