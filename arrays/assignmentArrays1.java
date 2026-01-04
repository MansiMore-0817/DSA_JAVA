// Question 1:Given an integer array nums,
//  return true if any value appears at least twice in the array,
//  and return false if every element is distinct

public class assignmentArrays1 {
    
    public static boolean arraychecking(int nums[]){
     
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                     return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean result = arraychecking(nums);
        System.out.println(result);
    }
}
