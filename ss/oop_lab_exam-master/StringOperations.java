package programs;

/*17. Write a program to read 10 string from console and then print the sorted strings on console (Use String Class).2) combine two string   3)reverse first string nd dispaly it . */
import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        System.out.println("Sorted strings:");
        sortStrings(strings);

        System.out.println("Combined string:");
        String combinedString = combineStrings(strings);
        System.out.println(combinedString);

        System.out.println("Reversed first string:");
        String reversedString = reverseString(strings[0]);
        System.out.println(reversedString);

        scanner.close();
    }

    public static void sortStrings(String[] strings) {
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String combineStrings(String[] strings) {
        StringBuilder combined = new StringBuilder();
        for (String string : strings) {
            combined.append(string);
        }
        return combined.toString();
    }

    public static String reverseString(String string) {
        StringBuilder reversed = new StringBuilder(string);
        return reversed.reverse().toString();
    }
}
