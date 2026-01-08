public class selectionSort{
        public static void selectionSort(int arr[]){
            for(int i = 0; i < arr.length - 1; i++){
                int minPos = i;
                int smallest = Integer.MAX_VALUE;
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[minPos] > arr[j]){ //if "<" then it will sort in descending order
                        minPos = j;
                    }
                }
                // Swap comes after inner loop
                //  because we must check ALL elements to truly know the smallest before we move it.
                // swap
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
            printArray(arr);

        }

        public static void printArray(int arr[]){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }

    public static void main(String[] args) {
            int arr[] = {5,4,1,3,2};

            selectionSort(arr);
            

    }

}