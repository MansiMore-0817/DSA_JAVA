//  Print out the sum of the numbers inthe second row of the “nums” array

public class assignment2 {

    public static int calculateSum(int matrix[][]){
        int sum = 0;
        int i = 1;
        for(int j = 0; j <= matrix[0].length - 1; j++){
            sum += matrix[i][j];
        }
        return sum;


      };

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };



        System.out.println(calculateSum(matrix));
    }
}
