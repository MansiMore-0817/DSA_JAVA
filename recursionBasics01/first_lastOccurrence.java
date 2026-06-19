public class first_lastOccurrence {
    

    public static int firstOcc(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] ==  key){
            return i;
        }
        return firstOcc(arr, i+1, key);
    }


    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOcc(arr, key , i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,6,1,2,5,0};
        int key = 5;
        System.out.println(firstOcc(arr, 0, key));
        System.out.println(lastOcc(arr, key, 0));
    }

}

