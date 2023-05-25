package programs;
//11.2) Write a java program to check that given number is prime or not.

import java.util.Scanner;

public class PrimeExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int m = n / 2;
        int flag = 0;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }

        scanner.close();
    }
}
