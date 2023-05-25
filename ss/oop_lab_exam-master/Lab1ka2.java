package programs;
//1.2) Write a Java program to find the common elements between two arrays of integers.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab1ka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Common Elements: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonList = new ArrayList<>();

        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2 && !commonList.contains(num1)) {
                    commonList.add(num1);
                }
            }
        }

        int[] commonElements = new int[commonList.size()];

        for (int i = 0; i < commonList.size(); i++) {
            commonElements[i] = commonList.get(i);
        }

        return commonElements;
    }
}

