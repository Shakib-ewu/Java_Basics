package day7;

public class whileAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5+10+15+-----+100=?
		
		int i=5;
		int sum=0;
		while(i<=100) {
			sum=sum+i;
			i=i+5;
		}
		System.out.println("Total sum is: "+sum);

	}

}
