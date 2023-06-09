package programs;

/*12. Write a Java program to display the pattern like a diamond.
Input number of rows (half of the diamond) :7 Expected Output :


* 
*** 
***** 
******* 
********* 
*********** 
************* 
*********** 
********* 
******* 
***** 
*** 
*
*/
import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (half of the diamond): ");
        int rows = scanner.nextInt();

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
