public class diagonalSum {
    

    public static int diagonalSumMatrix(int matrix[][]){     //TC = O(n^2) SC = O(1)
                    // Brute Force Approach
        // int sum = 0;
        // for(int i = 0; i <= matrix.length - 1; i++){
        //     for(int j = 0; j <= matrix[0].length - 1; j++){
        //         if( i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if( i + j == matrix.length - 1){    //to avoid middle element getting added twice in odd matrix
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;



        // Optimized Approach : TC = O(n) SC = O(1)
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];

            // secondary matrix
            // As in above brute force approach, the loop is used for j to find the secondary diagonal element
            // but here we can directly find it by using formula (matrix.length - 1 - i) 
            // as i + j = matrix.length - 1  =>  j = matrix.length - 1 - i

            // secondary diagonal
            if(i != matrix.length - 1 - i)  // to avoid middle element getting added twice in odd matrix
                sum += matrix[i][matrix.length - 1 - i];
            
        }
        return sum;
    }


    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10,11,12},
            {13,14,15,16}

        };
            
            System.out.println(diagonalSumMatrix(matrix));
        
        
    }
}
