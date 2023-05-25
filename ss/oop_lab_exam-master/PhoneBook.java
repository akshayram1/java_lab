package programs;

/*8. You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person. Use HashMap to implement it.The first line will have an integer denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number.
 */
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of entries in the phone book
        System.out.print("Enter the number of entries in the phone book: ");
        int numEntries = Integer.parseInt(scanner.nextLine());

        // Create a HashMap to store the phone book entries
        HashMap<String, String> phoneBook = new HashMap<>();

        // Read and store the phone book entries
        for (int i = 0; i < numEntries; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Read the queries and print the corresponding phone numbers
        System.out.println("\nEnter the queries (enter 'q' to quit):");
        while (true) {
            System.out.print("Query: ");
            String query = scanner.nextLine();
            if (query.equals("q")) {
                break;
            }
            if (phoneBook.containsKey(query)) {
                String phoneNumber = phoneBook.get(query);
                System.out.println(query + ": " + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
