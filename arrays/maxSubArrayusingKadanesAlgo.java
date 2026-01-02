// QS: Max SubArray using Kadanes algo(Best method)
            // For all negative values in array the code is given at end after this code

public class maxSubArrayusingKadanesAlgo {
    
    public static void KadanesMaxSubArr(int arr[]){

        int largestSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++){
            currSum = currSum +  arr[i];   



            if(currSum < 0){
                currSum = 0;
            }
            largestSum = Math.max(currSum, largestSum);
        }

        System.out.println("The max subarray sum is: " + largestSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        KadanesMaxSubArr(arr);
    }
}


                // For all negative values in array, safe code given below

// public class maxSubArrayUsingKadanesAlgo {

//     public static void kadanesMaxSubArr(int arr[]) {

//         int currSum = arr[0];
//         int largestSum = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             currSum = Math.max(arr[i], currSum + arr[i]);
//             largestSum = Math.max(largestSum, currSum);
//         }

//         System.out.println("The max subarray sum is: " + largestSum);
//     }

//     public static void main(String[] args) {
//         int arr[] = { -5, -2, -8, -1 };
//         kadanesMaxSubArr(arr);
//     }
// }
