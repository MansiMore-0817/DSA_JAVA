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
