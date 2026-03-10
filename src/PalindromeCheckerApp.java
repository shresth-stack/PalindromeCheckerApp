public class PalindromeCheckerApp {

    public static boolean checkPalindrome(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "madam";

        if (checkPalindrome(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");

    }
}