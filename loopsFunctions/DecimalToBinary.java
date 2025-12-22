import java.util.Scanner;

public class DecimalToBinary {
    public static void DecToBin(int decNum){
    int power = 0;
    int binNum = 0;
    while(decNum > 0){
        int rem = decNum % 2; 
        binNum = binNum + (rem * (int)( Math.pow(10, power)));

        power++;
        decNum = decNum / 2;
    }
    System.out.println("The binary number is: " + binNum);

}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decNum = sc.nextInt();

        DecToBin(decNum);

        sc.close();

    }
}
