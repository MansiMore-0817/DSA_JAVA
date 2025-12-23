import java.util.Scanner;

public class invertedAndRotatedHalfPyramid {

    public static void halfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {    //here j is for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {         //here j is for stars
                System.out.print("*");        //Characters print sequentially from left to right; spaces move the cursor, stars print at the current cursor position.
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        halfPyramid(rows);
    }
}
