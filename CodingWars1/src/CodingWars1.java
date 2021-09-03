
public class CodingWars1 {

	public static void main(String[] args) {
		
		System.out.println(spinWords("Hey fellow warriors"));
	}
	
	public static String spinWords(String sentence) {
		String sentenceArray[] = sentence.split(" ");
		sentence = "";
		for (int i = 0; i < sentenceArray.length; i++) {
			if (sentenceArray[i].length() >= 5 && sentenceArray.length > 1) {
				StringBuffer reversed = new StringBuffer(sentenceArray[i]).reverse();
				String reversedString = reversed.toString();
				
				sentence += reversedString + " ";
			}
			else if (sentenceArray[i].length() >= 5) {
				StringBuffer reversed = new StringBuffer(sentenceArray[i]).reverse();
				String reversedString = reversed.toString();
				
				sentence += reversedString;
			}
			else if (sentenceArray) {
				sentence += sentenceArray[i] + " ";
			}
		}
		
		return sentence;
	}

}
