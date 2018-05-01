package WordsInString;

public class wordsInString {
	
	public static void main(String[] args) {
		String sentence = "This is a senctance with seven words";
		System.out.println(wordCount(sentence));
	}
	
	public static int wordCount(String str) {
		int word_count = 1;
		char space = ' ';
		
		for(int ii = 0; ii < str.length(); ii++) {
			if(str.charAt(ii) == space) {
				word_count++;
			}
		}
		return word_count;
	}
}
