/*
 * Program Name: pairsInArray
 * Description:
 *   - This program prints all possible unique pairs that can be formed
 *     from the elements of a given integer array.
 *   - It uses nested loops:
 *        * Outer loop picks one element at a time.
 *        * Inner loop pairs it with every element that comes after it.
 *   - Also counts and prints the total number of such pairs.
 *
 * Time Complexity: O(n^2)
 * Author: <Your Name>
 * Date: <Today's Date>
 */



import java.util.*;

public class pairsInArray {

    public static void printPairs(int arr[]) {
        int total_pairs = 0;
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int secondNum = arr[j];
                System.out.print("(" + current + "," + secondNum + "), ");
                total_pairs++;
            }
            System.out.println();

        }
        System.out.println("Total pairs = " + total_pairs);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        printPairs(arr);
    }
}
