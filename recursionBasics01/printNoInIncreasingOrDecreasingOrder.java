public class printNoInIncreasingOrDecreasingOrder {
      //no in decreasing order using recursion
        public static void printDec(int n){
            if(n==1){
                System.out.println(n);
                return;
            }
            System.out.println(n+" ");
            printDec(n-1);

        }

        // no in increasing order using recursion
        public static void printInc(int n){
            if(n==1){
                System.out.println(n + " ");
                return;
            }

            printInc(n - 1);
            System.out.println(n + " ");
        }

    public static void main(String[] args) {
        int n = 10;
        // printDec(n);

        printInc(n);
    }
}
