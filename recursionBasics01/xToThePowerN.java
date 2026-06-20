public class xToThePowerN {

    public static int xToThePowerN(int x, int n){
        if(n==0){
            return 1;
        }
        int xPownm1 = xToThePowerN(x, n-1);
        int xPown = x * xPownm1;
        return xPown;


        // OR IN SINGLE LINE
        // return x * xToThePowerN(x, n-1);
    }


    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(xToThePowerN(x, n));
    }

}