package programs;

/*16. Write a Java Program to count the number of words in a string using HashMap.Output:
Input :Enter String: "This this is is done by Saket Saket";
{Saket=2, by=1, this=1, This=1, is=2, done=1}
 */
import java.util.HashMap;
import java.util.Scanner;

public class StringWordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        HashMap<String, Integer> wordCountMap = countWords(input);

        System.out.println(wordCountMap);

        scanner.close();
    }

    public static HashMap<String, Integer> countWords(String input) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Count the occurrence of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
