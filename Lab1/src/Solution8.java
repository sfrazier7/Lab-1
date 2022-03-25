
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution8 {

	public static void main(String[] args) throws IOException {
		
		//Reads The file
		FileReader fr = new FileReader(new File("C:\\Users\\Owner\\Documents\\the_prince_quotes.txt"));
		
		//Convert The file into String
		BufferedReader br = new BufferedReader(fr);
		
		//try ArrayList Convert from String Stream using br methods
		ArrayList<String> fileText = new ArrayList<String>();
		
		
		//Use the String Split Method to Seperate strings into singular arrays and indexes
		
		HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
		
		
		Integer count = 1;
		for(int i = 0; i < fileWordArray.length; i++) {
			//word gets added as a new key if it isn't found
			if(!wordCounter.containsKey(fileWordArray[i])) {
				wordCounter.put(fileWordArray[i], count);
			} else {
				//if found integer pair value goes up
				wordCounter.replace(fileWordArray[i], count, count++);
			}
		}
		//HashMap Values Get Printed
		System.out.println(wordCounter);
	}
}
