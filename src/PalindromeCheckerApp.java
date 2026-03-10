public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker Application");

        String original = "racecar";
        String reversed = "";

        // Reverse string using loop
        for(int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if(original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }

    }
}