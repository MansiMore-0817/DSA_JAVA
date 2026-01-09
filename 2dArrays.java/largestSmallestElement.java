public class largestSmallestElement {

    public static void largestSmallestElement(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("Largest element is " + largest);
        System.out.println("Smallest element is " + smallest);

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 23, 4, 1 },
                { 67, 88, 29 },
                { 12, 5, 7 }
        };

        largestSmallestElement(matrix);

    }
}
