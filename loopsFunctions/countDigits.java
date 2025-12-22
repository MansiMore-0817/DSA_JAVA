import java.util.Scanner;

public class countDigits {

    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num /10;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        System.out.println("The number of digits in " + num + " is " + count);
    }
}
