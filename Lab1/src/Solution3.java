
public class Solution3 {

	public static void main(String[] args) {
		
		//Counter
		int c = 0;
		
		while(true) {
			c++;
			if(c == 3) {
				continue;
			}
			if(c == 5) {
				break;
			}
			System.out.println(c);
		}

	}

}
