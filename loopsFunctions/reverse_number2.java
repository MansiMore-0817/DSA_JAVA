// Java program to reverse a number

public class reverse_number2 {
    public static void main(String[] args) {
        int num = 12345666;
        int revNum = 0;
        while(num > 0){
            int lastDigit = num % 10;   // this gets the last digit of num
            revNum = (revNum * 10) + lastDigit; 
            
            num = num / 10;  // this removes the last digit from num
        }
        System.out.print(revNum);
    }
}
