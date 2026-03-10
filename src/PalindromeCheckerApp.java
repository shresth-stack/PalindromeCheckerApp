public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String sentence = "Nurses Run";

        String processed = sentence.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed += processed.charAt(i);
        }

        if (processed.equals(reversed))
            System.out.println(sentence + " is a Palindrome");
        else
            System.out.println(sentence + " is NOT a Palindrome");

    }
}