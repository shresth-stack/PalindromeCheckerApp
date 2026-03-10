public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        String word = "madam";

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

}