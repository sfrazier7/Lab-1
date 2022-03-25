import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = key.nextInt();
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			System.out.println("The year you entered is a leap year.");
		} else {
			System.out.println("The year your entered is not a leap year.");
		}
		
		key.close();
	}
}
