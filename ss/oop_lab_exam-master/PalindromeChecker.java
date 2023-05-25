package programs;

//3.2) Write a Java program to check that String is palindrome or not.
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String inputString) {
        String reversedString = reverseString(inputString);
        return inputString.equalsIgnoreCase(reversedString);
    }

    public static String reverseString(String inputString) {
        StringBuilder reversed = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }

        return reversed.toString();
    }
}
/*
 * import java.util.Scanner;
 * 
 * public class PalindromeChecker {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * System.out.print("Enter a string: ");
 * String inputString = scanner.nextLine();
 * 
 * boolean isPalindrome = checkPalindrome(inputString);
 * 
 * if (isPalindrome) {
 * System.out.println("The string is a palindrome.");
 * } else {
 * System.out.println("The string is not a palindrome.");
 * }
 * }
 * 
 * public static boolean checkPalindrome(String inputString) {
 * int left = 0;
 * int right = inputString.length() - 1;
 * 
 * while (left < right) {
 * if (inputString.charAt(left) != inputString.charAt(right)) {
 * return false;
 * }
 * left++;
 * right--;
 * }
 * 
 * return true;
 * }
 * }
 */
