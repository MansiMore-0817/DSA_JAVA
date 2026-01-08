// More optimized version written below at last


public class bubbleSort {
    
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length - 1; turn++){
            for(int j = 0; j < arr.length - 1 - turn; j++){
                if(arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

         printArray(arr);

    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] ={ 5,4,1,6,2,3};


        bubbleSort(arr);
       
    }
}





                    // More optimized version with TC = O(n) in best case
// public static void bubbleSort(int arr[]) {
//     int n = arr.length;

//     for (int i = 0; i < n - 1; i++) {
//         int swapped = 0;   // 0 = no swap happened yet

//         for (int j = 0; j < n - i - 1; j++) {
//             if (arr[j] > arr[j + 1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;

//                 swapped = 1; // swap happened
//             }
//         }

//         // if still 0 → array is sorted
//         if (swapped == 0) {
//             break;
//         }
//     }
// }

