public class solidRhombus {
        
    public static void solidRhombus(int n){


        for(int i = 1; i<= n; i++){
            // spaces
            for(int j = n-i; j> 0; j--){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(7);
    }
}
