import java.util.Scanner;
 
public class UserInterface {
 
    private static boolean isValidSentence(String sentence) {
        return sentence.matches("[a-zA-Z ]+");
    }
 
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
 
        if (!isValidSentence(sentence)) {
            System.out.println(sentence + " is an invalid sentence");
            return;
        }
 
        String[] words = sentence.split("\\s+");
 
        if (words.length <= 2) {
            System.out.println("Invalid Length");
            return;
        }
 
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
 
        StringBuilder middlePart = new StringBuilder();
        for (int i = 1; i < words.length - 1; i++) {
            middlePart.append(words[i]);
            if (i < words.length - 2) {
                middlePart.append(" ");
            }
        }
        String reversedMiddle = reverseString(middlePart.toString());
 
        String result = lastWord + " " + reversedMiddle + " " + firstWord;
 
        System.out.println(result);
 
        sc.close();
    }
}