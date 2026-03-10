public class PalindromeChecker {
    public class StackPalindromeChecker {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Stack<Character> stack = new Stack<>();

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Push characters into stack
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            // Pop characters to build reversed string
            String reversed = "";

            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            // Compare original and reversed strings
            if (input.equals(reversed)) {
                System.out.println("The string is a Palindrome.");
            } else {
                System.out.println("The string is NOT a Palindrome.");
            }

            scanner.close();
        }
}
