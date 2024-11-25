import java.util.Scanner;

public class VerbiageHunt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word count:");
        int wc = sc.nextInt();
        
        if (wc < 2) {
            System.out.println("Invalid word count");
            return;
        }
        
        System.out.println("Enter the words:");
        String[] words = new String[wc];
        
        for (int i = 0; i < wc; i++) {
            words[i] = sc.next();
            // Validate each word using regex
            if (!words[i].matches("[a-zA-Z]+")) {
                System.out.println(words[i] + " is an invalid word");
                return;
            }
        }
        
        System.out.println("Enter the character to search:");
        char searchChar = sc.next().charAt(0);
        
        StringBuilder withoutDuplicates = new StringBuilder("Without duplicates: ");
        StringBuilder withDuplicates = new StringBuilder("With duplicates: ");
        int countWithout = 0;
        int countWith = 0;

        // Iterate over each word to count occurrences of the search character
        for (String word : words) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (searchChar == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                withoutDuplicates.append(word).append(" ");
                countWithout++;
            } else if (count > 1) {
                withDuplicates.append(word).append(" ");
                countWith++;
            }
        }

        // Output results
        if (countWithout == 0 && countWith == 0) {
            System.out.println("No words found");
        } else {
            if (countWithout > 0) {
                System.out.println(withoutDuplicates.toString());
            }
            if (countWith > 0) {
                System.out.println(withDuplicates.toString());
            }
        }
    }
}
