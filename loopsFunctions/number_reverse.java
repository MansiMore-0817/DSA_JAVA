// Qs Write a program to print the digits of a number in reverse order.

public class number_reverse {
    public static void main(String[] args) {
        int num = 12345;

        while (num > 0) {
            int last_digit = num % 10;
            System.out.print(last_digit + " ");
            num = num / 10;

        }

    }
}
