package programs;

//3.1)Java Program to Reverse a String. 
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);

        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String inputString) {
        StringBuilder reversed = new StringBuilder();

        // Iterate through the characters of the inputString in reverse order
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }

        return reversed.toString();
    }
}
