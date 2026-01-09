import java.util.Arrays;


public class assignmentSorting {

    public static void bubbleSort(int arr[]) {
        // Bubble sort
        int n = arr.length;
        for (int turns = 0; turns < n - 1; turns++) {
            for (int j = 0; j < n - turns - 1; j++) {
                // swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);

    }

    // Selection sort
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){''
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                
                }
                
            }
            // swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

    }

    // Insertion sort
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int previous = i - 1;
            while(previous >= 0 && arr[previous] > current){
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;
        }
        printArray(arr);
    }

    // Inbuilt sort
    public static void inbuiltSort(int arr[]){
        Arrays.sort(arr);
        printArray(arr);
    }
        
    // Counting Sort
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int countArr[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++){
            countArr[arr[i]]++;
        }


        // sorting and refilling the original array
        int j = 0;
        for(int i = 0; i < countArr.length; i++){
            while(countArr[i] > 0){

                arr[j] = i;
                j++;
                countArr[i]--;
            }
        }

        printArray(arr);
    }




    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // inbuiltSort(arr);
        countingSort(arr);
    }
}
