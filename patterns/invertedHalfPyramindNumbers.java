import java.util.Scanner;

public class invertedHalfPyramindNumbers {
    
    public static void invertedNumericalHalfPyramind(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<= rows - i +1; j++){
                System.out.print(j);
            }
            for(int k = 1; k <= i - 1; k++){
                System.out.print(" ");
            }
            System.out.println();

        }


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        invertedNumericalHalfPyramind(rows);
    }
}
