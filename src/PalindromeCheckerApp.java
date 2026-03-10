public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker Application");

        String word = "madam";

        // Convert string to char array
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Two pointer comparison
        while(start < end) {

            if(chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

    }
}