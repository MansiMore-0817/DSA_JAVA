import java.util.*;

public class largestNum {
    public static int largestNumInArray(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] >  largest){
                largest = numbers[i];
            }
        }
        return largest;

    }

    public static void main(String [] args) {
        int numbers[] = {2,5,8,1000, 77, 42, 79, 20,11};

        int largestNum = largestNumInArray(numbers);
        System.out.println("The largest number in an array is: " + largestNum);
    }
}
