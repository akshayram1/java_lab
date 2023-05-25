//Write a Java program to display the pattern like a diamond.
// Input number of rows (half of the diamond) :7 Expected Output :
// * 
// *** 
// ***** 
// ******* 
// ********* 
// *********** 
// ************* 
// *********** 
// ********* 
// ******* 
// ***** 
// *** 
// *


import java.util.Scanner;

public class DiamondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        n = n * 2;
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (a = n-1; a > 0; a--) {
            for (b = a-1; b >= 0; b--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
