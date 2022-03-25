import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String state = "";
		ArrayList<String> states = new ArrayList<String>();
		
		while(!state.equalsIgnoreCase("done")) {
			System.out.println("Enter a state you have visited. Enter 'done' if you are finished.");
			System.out.println("State name:");
			state = key.nextLine();
			if(state.equalsIgnoreCase("done")) {
				break;
			}
			states.add(state.toLowerCase());
		}
		HashSet<String> visitedStates = new HashSet<String>(states);
		System.out.println(visitedStates);
		key.close();
	}

}
