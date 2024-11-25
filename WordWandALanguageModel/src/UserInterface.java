import java.util.Scanner;

class SentenceManipulator {
    private String sentence;

    // Constructor
    public SentenceManipulator(String sentence) {
        this.sentence = sentence;
    }

    // Method to validate the sentence
    public boolean isValid() {
        return sentence.matches("[a-zA-Z\\s]+");
    }

    // Method to count words in the sentence
    public int wordCount() {
        return sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
    }

    // Method to reverse each word in the sentence
    public String reverseWords() {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            reversedSentence.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    // Method to reverse the order of words in the sentence
    public String reverseWordOrder() {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedOrderSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedOrderSentence.append(words[i]).append(" ");
        }
        return reversedOrderSentence.toString().trim();
    }

    // Main method to perform the sentence manipulation
    public void manipulate() {
        if (!isValid()) {
            System.out.println("Invalid Sentence");
            return;
        }

        int count = wordCount();
        System.out.println("Word Count: " + count);

        if (count % 2 == 0) {
            System.out.println(reverseWordOrder());
        } else {
            System.out.println(reverseWords());
        }
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = sc.nextLine();

        SentenceManipulator manipulator = new SentenceManipulator(input);
        manipulator.manipulate();

        sc.close();
    }
}
