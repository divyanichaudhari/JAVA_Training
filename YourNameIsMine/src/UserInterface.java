import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input names
        System.out.println("Enter the man name");
        String manName = scanner.nextLine().trim();
        System.out.println("Enter the woman name");
        String womanName = scanner.nextLine().trim();

        // Validate names
        if (!isValidName(manName) && !isValidName(womanName)) {
            System.out.println("Both " + manName + " and " + womanName + " are invalid names");
            return;
        } else if (!isValidName(manName)) {
            System.out.println(manName + " is an invalid name");
            return;
        } else if (!isValidName(womanName)) {
            System.out.println(womanName + " is an invalid name");
            return;
        }

        // Check subsequence
        if (isSubsequence(manName, womanName) || isSubsequence(womanName, manName)) {
            System.out.println(manName + " and " + womanName + " are made for each other");
            // Calculate compatibility value
            int compatibilityValue = calculateCompatibilityValue(manName, womanName);
            System.out.println("Compatibility Value is " + compatibilityValue);
        } else {
            System.out.println(manName + " and " + womanName + " are not made for each other");
        }
    }

    private static boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+"); // Validates that the name contains only letters and spaces
    }

    private static boolean isSubsequence(String s1, String s2) {
        int j = 0;
        for (int i = 0; i < s2.length() && j < s1.length(); i++) {
            if (s1.charAt(j) == s2.charAt(i)) {
                j++;
            }
        }
        return j == s1.length();
    }

    private static int calculateCompatibilityValue(String s1, String s2) {
        // Ensure s1 is the shorter string
        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        int m = s1.length();
        int n = s2.length();
        
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp array
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j; // If first string is empty
                } else if (j == 0) {
                    dp[i][j] = i; // If second string is empty
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No change needed
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])); // Insert, delete, substitute
                }
            }
        }
        
        return dp[m][n]; // Return the edit distance
    }
}