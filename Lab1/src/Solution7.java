import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter two integers.");
		
		try {

			int num1 = key.nextInt();
			int num2 = key.nextInt();
			int quotient = num1/num2;
			
			System.out.println(quotient);
			
		} catch(ArithmeticException e) {
			System.out.println("There was an arithmetic error.");
			e.printStackTrace();	
		}catch (RuntimeException e) {
			System.out.println("There was a runtime error :" + e.getLocalizedMessage());
		}
		key.close();
		System.out.println("Thank you.");
	}

}
