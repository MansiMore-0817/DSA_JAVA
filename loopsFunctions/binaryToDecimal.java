import java.util.Scanner;

public class binaryToDecimal {

    public static void binToDec(int binNum) {
        int power = 0;
        int decimalNum = 0;
        int myNum = binNum;

        while (myNum > 0) {
            int lastDigit = myNum % 10; // to get the last digit divide by 10 and remainder is your last digit
            decimalNum = decimalNum + (lastDigit * (int) Math.pow(2, power));
            power++;
            myNum = myNum / 10; // to remove the last digit divide by 10
        }

        System.out.println("Decimal equivalent is: " + decimalNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        int binNum = sc.nextInt();

        binToDec(binNum);
        sc.close();
    }
}