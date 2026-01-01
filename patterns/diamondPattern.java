public class diamondPattern {
    
    public static void printDiamond(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = (rows - i); j>= 0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i+ (i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = rows; i >= 1; i--){  //just reverse the outer loop for mirror img below
            for(int j = (rows - i); j>= 0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i+ (i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printDiamond(4);
    }
}
