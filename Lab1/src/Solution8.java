import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;


public class Solution8 {

	public static void main(String[] args) throws IOException {
		
		//Reads The file
		FileReader fr = new FileReader(new File("C:\\Users\\ShafirFrazier\\OneDrive - Xpanxion\\Documents\\the_prince_quotes.txt"));
		
		//Convert The file into String
		BufferedReader br = new BufferedReader(fr);
		
		//Use the String Split Method to Seperate strings into singular arrays and indexes
		String[] fileWordArray = br.readLine().split(" ");
		System.out.println(Arrays.toString(fileWordArray));
		HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
		
		
		Integer count;
		for(int i = 0; i < fileWordArray.length; i++) {
			//word gets added as a new key if it isn't found
			if(!(wordCounter.containsKey(fileWordArray[i].toLowerCase()))) {
				wordCounter.put(fileWordArray[i], 1);
			} else {
				count = wordCounter.get(fileWordArray[i]);
				wordCounter.replace(fileWordArray[i], count, count+1);
			}
		}
		//HashMap Values Get Printed
		System.out.println(wordCounter);
	}
}
