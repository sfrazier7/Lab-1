
public class Solution1 {
	
	public static void main(String[] args) {
		
		String sentence = "Hello World! I think we need to travel to Mars.";
		String[] sentencearr = sentence.split(" ");
		String[] reversesentence = new String[sentencearr.length];
		
		StringBuffer sb = new StringBuffer();
		
		int j = 0;
		
		for(int i = sentencearr.length-1; i > -1; i--) {
			reversesentence[j] = sentencearr[i];
			sb.append(reversesentence[j]);
			sb.append(" ");
			j++;	
		}
	
		
		String reverse = sb.toString();
		System.out.println(sentence);
		System.out.println(reverse);
		
	}

}
