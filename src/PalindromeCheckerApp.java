public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("        Palindrome Checker App");
        System.out.println("        Version 1.0");
        System.out.println("====================================");
        System.out.println("Welcome! This application checks whether a word is a palindrome.\n");

        String word = "level";
        boolean isPalindrome = true;

        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a Palindrome (UC4).");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome (UC4).");
        }
    }
}
