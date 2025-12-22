// To check if a number is prime or not

import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n == 2) {
            isPrime = true;
        } else {
            //can use i< n-1 as well...but the loop runs n-2 times here..to make it more optimized we use 'square root of n"
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is a multiple of i(where i is not equal to 1 or n)
                    isPrime = false;
                }
            }

        }

        if (isPrime == true) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}
