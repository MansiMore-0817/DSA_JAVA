import java.util.*;

public class linearSearch {

    public static int linearSearchNum(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6 };
        int target = 8;

        int index = linearSearchNum(numbers, target);

        if (index == -1) {
            System.out.println("The target is not in the array");
        }

        else {
            System.out.println("Target is at index " + index);

        }
    }

}
