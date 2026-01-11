// Write a program to Find Transpose of a Matrix.
// What is Transpose? Transpose of a matrix is the process of swapping the rows to columns



public class assignment3 {

    public static void transposeMatrix(int matrix[][]) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;

        int transRows = cols + 1;
        int transCols = rows + 1;

        int transposedMatrix[][] = new int[transRows][transCols];

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // print transposed matrix

        for (int i = 0; i < transRows; i++) {
            for (int j = 0; j < transCols; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },

        };

        transposeMatrix(matrix);

    }

}
