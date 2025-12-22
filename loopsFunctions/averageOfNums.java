import java.util.Scanner;

public class averageOfNums {

        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number 1: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println("Enter the third number");
            int c = sc.nextInt();

            int sum = 0;
            sum = a + b + c;
            int average = sum/3;
            System.out.println("The sum of this three numbers is: " + average);



        }



}