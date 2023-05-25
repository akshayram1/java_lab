package programs;

/*23. Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
 */
import java.io.*;
import java.util.*;

class GFG {
    static int findLongestConseqSubseq(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);
        int ans = 0, count = 0;
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(arr[0]);
        // Insert repeated elements
        // only once in the vector
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1])
                v.add(arr[i]);
        }
        // Find the maximum length
        // by traversing the array
        for (int i = 0; i < v.size(); i++) {

            // Check if the current element is
            // equal to previous element +1
            if (i > 0 && v.get(i) == v.get(i - 1) + 1)
                count++;
            else
                count = 1;
            // Update the maximum
            ans = Math.max(ans, count);
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 49, 1, 3, 200, 2, 4, 70, 5 };
        int n = arr.length;
        System.out.println(
                "Length of the Longest "
                        + "contiguous subsequence is "
                        + findLongestConseqSubseq(arr, n));
    }
}
