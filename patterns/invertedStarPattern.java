public class invertedStarPattern {
    public static void main(String [] args){
        int n = 2;
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }


}
