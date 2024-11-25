import java.util.Scanner;
import java.util.Arrays;
 
class SentenceProcessor {
 
    public boolean isValidInput(String sentence) {
        return sentence.matches("[a-z ]+");
    }
 
    public String arrangeLettersInWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
 
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            result.append(new String(chars)).append(" ");
        }
 
        return result.toString().trim();
    }
}
 
public class UserInterface {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SentenceProcessor processor = new SentenceProcessor();
 
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
 
        if (processor.isValidInput(sentence)) {
            String result = processor.arrangeLettersInWords(sentence);
            System.out.println(result);
        } else {
            System.out.println(sentence + " is an invalid input");
        }
 
        sc.close();
    }
}
 