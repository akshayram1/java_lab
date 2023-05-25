package programs;

//13.2) Write Java Program to find the number of the words in the given text file.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try {
            // Open the text file
            File file = new File("D:/avitsem4/oop/lab _exam/Labexam/src/programs/Labexamquestions.txt");
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            // Iterate through each line of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");

                // Update the word count
                wordCount += words.length;
            }

            // Close the scanner
            scanner.close();

            System.out.println("Number of words in the file: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
