package programs;

//2. 1) Java Program to Count Number of Duplicate Words in String
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Map<String, Integer> wordCountMap = countDuplicateWords(inputString);

        System.out.println("Duplicate Words Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static Map<String, Integer> countDuplicateWords(String inputString) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = inputString.toLowerCase().split(" ");

        // Count the occurrence of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
