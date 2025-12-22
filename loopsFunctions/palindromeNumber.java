import java.util.Scanner;

public class palindromeNumber {

     public static int checkPalindrome(int num){
    int original = num;    //If a variable is modified in a loop and needed later → preserve it first.
        int revNum = 0;
        while(original > 0){
            int rem = original % 10;
            revNum = revNum * 10 + rem;
             original = original / 10;
        }
        return revNum;
     }   

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int revNum = checkPalindrome(num);
        if(revNum == num){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
