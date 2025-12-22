import java.util.Scanner;

public class primesInRange {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if (n == 2 || n == 1) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }

    public static void printPrimesInRange(int start, int end) {

        for (int s = start; s <= end; s++) {
            if (isPrime(s)) {
                System.out.print(s + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of range");
        int start = sc.nextInt();
        System.out.println("Enter the end of range");
        int end = sc.nextInt();

        printPrimesInRange(start, end);

    }
}
