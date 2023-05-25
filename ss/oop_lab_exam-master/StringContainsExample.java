package programs;

//2.2) How to Check if the String Contains 'e' in umbrella
public class StringContainsExample {
    public static void main(String[] args) {
        String word = "umbrella";

        boolean containsE = checkIfContainsE(word);

        if (containsE) {
            System.out.println("The string '" + word + "' contains 'e'.");
        } else {
            System.out.println("The string '" + word + "' does not contain 'e'.");
        }
    }

    public static boolean checkIfContainsE(String word) {
        return word.contains("e");
    }
}

/*
 * public class StringContainsExample {
 * public static void main(String[] args) {
 * String word = "umbrella";
 * 
 * boolean containsE = checkIfContainsE(word);
 * 
 * if (containsE) {
 * System.out.println("The string '" + word + "' contains 'e'.");
 * } else {
 * System.out.println("The string '" + word + "' does not contain 'e'.");
 * }
 * }
 * 
 * public static boolean checkIfContainsE(String word) {
 * for (int i = 0; i < word.length(); i++) {
 * if (word.charAt(i) == 'e') {
 * return true;
 * }
 * }
 * return false;
 * }
 * }
 */
