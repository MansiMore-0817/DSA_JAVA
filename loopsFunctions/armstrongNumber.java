import java.util.Scanner;

public class armstrongNumber {
    

    public static void armstrongNumberCheck(int num){
        int originalNum = num;
        int sum = 0;
        int numOfDigits = String.valueOf(originalNum).length();         //you can count the number of digits by loop as well.
        while(originalNum > 0){
            int lastDigit = originalNum % 10;
            sum += (int)Math.pow(lastDigit, numOfDigits);
            originalNum = originalNum / 10;
            
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println(num + " is not an Armstrong number.");
        }

} 

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        armstrongNumberCheck(num);
        
    }
}
