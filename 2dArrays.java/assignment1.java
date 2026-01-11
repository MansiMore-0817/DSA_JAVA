// Print the number of 7’s that are in the 2d array

public class assignment1 {
    
        public static int searchIn2dArray(int matrix[][], int key){
            int row = matrix.length;
            int col = matrix[0].length;
            int count = 0;
            for(int i = 0; i < row; i++){
                for(int j =0; j < col; j++){
                    if(matrix[i][j] == key){
                        count++;
                        System.out.println("key found at index: " + i + ", " + j + " ");

                    }
                }
            }
            return count;

        }


    public static void main(String[] args) {
        int matrix[][] = {
            {4,7,8},
            {8, 8, 7}
        };


        int key = 7;
        int count = searchIn2dArray(matrix, key);
        System.out.println("Total occurrences of key: " + count);

    }

}
