package programs;
//1.1) Program to remove all repeated elements from an array                                                                                         
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without Duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!uniqueList.contains(array[i])) {
                uniqueList.add(array[i]);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];

        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }
}