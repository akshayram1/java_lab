package programs;

/*15. Write a Java Program to iterate ArrayList using for-loop, iterator, and advance for-loop. Insert 3 Array List.Input 20 30 40Output:


iterator Loop:
20
30
40
Advanced For Loop:
20
30
40
For Loop:
20
30
40
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("ArrayList elements:");
        System.out.println("Iterator Loop:");
        iterateUsingIterator(numbers);

        System.out.println("Advanced For Loop:");
        iterateUsingAdvancedForLoop(numbers);

        System.out.println("For Loop:");
        iterateUsingForLoop(numbers);

        scanner.close();
    }

    // Iterate using Iterator
    public static void iterateUsingIterator(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Iterate using Advanced For Loop
    public static void iterateUsingAdvancedForLoop(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    // Iterate using regular For Loop
    public static void iterateUsingForLoop(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
