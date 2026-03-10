public class PalindromeCheckerApp {

    static boolean reverseStrategy(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    static boolean twoPointerStrategy(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "level";

        if (twoPointerStrategy(word))
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");

    }
}