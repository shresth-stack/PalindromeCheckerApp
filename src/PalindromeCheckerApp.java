public class PalindromeCheckerApp {

    static boolean reverseMethod(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    static boolean twoPointerMethod(String word) {

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

        String word = "racecar";

        long start1 = System.nanoTime();
        reverseMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        twoPointerMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Time: " + (end1 - start1));
        System.out.println("Two Pointer Method Time: " + (end2 - start2));

    }
}