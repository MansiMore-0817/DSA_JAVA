// QS: Max Sub Array Sum using Prefix Array 

public class maxSubArrayusingPrefixArr {

    public static void maxSubArr(int arr[]){
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0]; //imp-common mistake one forgets to write this

        
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.print("Prefix Subarray is: ");
        for(int i = 0; i < prefix.length; i++){
            System.out.print(prefix[i] + " ");
        }

        int largestSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < prefix.length; i++){ //start
            int start = i; 
            for(int j = i +1; j < prefix.length; j++){ //end
                int end = j;  
                 sum = start == 0 ? prefix[end] :  prefix[end] - prefix[start - 1];    //imp-common mistake here

                  if(sum > largestSum){
                largestSum = sum;
            }
            }

           
        }
        System.out.println("\nThe largest sum of subarray is: " + largestSum);

    }


    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        maxSubArr(arr);

        
    }
}
