import java.util.Scanner;
import java.lang.Math;

public class Solution5 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a decimal number.");
		float number = key.nextFloat();
		
		System.out.println("The ceil value of the number is " + Math.ceil(number));
		System.out.println("The floor value of the number is " + Math.floor(number));
		System.out.println("The number rounded to its nearest integer is " + Math.round(number));
		
		key.close();


	}

}
