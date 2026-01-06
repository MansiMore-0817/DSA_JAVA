/*
Binary Search Algorithm (Iterative Approach)

→ Binary search is an efficient searching technique used on a SORTED array.
→ It works by repeatedly dividing the search space into two halves.
→ In each iteration, the middle element is compared with the key.
→ If the key matches the middle element, its index is returned.
→ If the key is smaller, the search continues in the left half.
→ If the key is larger, the search continues in the right half.
→ The process continues until the element is found or the search space becomes invalid.

Pre-condition:
- The array must be sorted in ascending order.

Time Complexity:
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

Space Complexity:
- O(1) since no extra space is used (iterative approach).

This program demonstrates binary search using a while loop in Java.
*/


import java.util.*;

public class binarySearch {

    public static int binarySearchNum(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int key = 22;

        int binarySearchNum = binarySearchNum(numbers, key);
        if (binarySearchNum == -1) {
            System.out.println("The key is not found");
        } else {
            System.out.println("The key is found at index " + binarySearchNum);

        }
    }

}
