// Java program to demonstrate the use of continue keyword. This program
// takes and prints the input from user until the user enters a number which is multiple of 10.
// the num multiple of 10 is taken but skipped from printing while the rest of the code continues to execute.
import java.util.Scanner;

public class continueKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number" + " ");

            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println(num);
        }while(true);
    }
}
