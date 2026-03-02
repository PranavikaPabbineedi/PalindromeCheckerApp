public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("        Palindrome Checker App");
        System.out.println("        Version 1.0");
        System.out.println("====================================");
        System.out.println("Welcome! This application checks whether a word is a palindrome.\n");

        String original = "racecar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a Palindrome.");
        }
    }
}
