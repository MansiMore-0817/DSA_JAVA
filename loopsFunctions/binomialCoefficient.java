import java.util.*;

public class binomialCoefficient {
        public static int factorial(int n){
            int f = 1;
            for(int i = 1; i<= n; i++){
                f = f*i;
            }
            return f;
        }    


        public static int binCoeff(int n, int r)
        {
            int a = factorial(n);
            int b = factorial(r);
            int c = factorial(n-r);
            int res = a/(b*c);
            return res;
        }
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter value of n");
                int n = sc.nextInt();
                System.out.println("Enter value of r");
                int r = sc.nextInt();

                int binCoeff = binCoeff(n, r);
                System.out.println("The binomial coefficient is:" + binCoeff);


                sc.close();

        }



}
