// Max Subarray Sum - Brute Force

import java.util.*;

public class printSubarrays {
    public static void printSubArrays(int arr[]) {
        int total_subarrays = 0;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) { // start
            for (int j = i; j < arr.length; j++) { // end
                int sum = 0;
                System.out.print("{ ");
                for (int k = i; k <= j; k++) { // print

                    sum += arr[k];

                    System.out.print(arr[k] + " ");

                }


                //Common Mistake: below if condition should be written after print vala (k) loop... not inside print loop.. basically after one subarray is formed
                if (sum > largest) {
                    largest = sum;
                }
                System.out.print("} ");
                total_subarrays++;
            }
            System.out.println();
        }
        System.out.println("The total number of sub arrays: " + total_subarrays);
        System.out.println("The largest sum of sub array is " + largest);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        printSubArrays(arr);
    }
}
