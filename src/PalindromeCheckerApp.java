import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : word.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {

            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");

    }
}