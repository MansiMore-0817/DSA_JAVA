import java.util.*;

public class factorialNum {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int res = factorial(num);
        System.out.println("The factorial of number " + num + " is: " + res);

        sc.close();
    }
}
