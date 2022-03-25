
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Reader2 {

	public static void main(String[] args) throws Exception {
		
		//File path passed as a parameter
		File file = new File("C:\\Users\\ShafirFrazier\\Downloads\\the-office-quotes.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String ct;
		
		
		while((ct = br.readLine()) != null) {
			System.out.println(ct);
		}
		
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		
		br.close();
		fr.close();
	}
}
