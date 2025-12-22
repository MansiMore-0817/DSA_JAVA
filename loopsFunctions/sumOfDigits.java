import java.util.Scanner;

public class sumOfDigits {

    public static int sumDigits(int num){
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum +=  lastDigit;
            num = num / 10;
        }
        return sum;
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int sum = sumDigits(num);
        System.out.println("The sum of digits of " + num + " is " + sum);
    }

}
