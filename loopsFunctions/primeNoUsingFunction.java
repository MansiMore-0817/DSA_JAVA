import java.util.Scanner;

public class primeNoUsingFunction {
    public static boolean isPrime(int n){
       boolean  isPrime = true;

       if(n == 2 || n == 1){
          isPrime = true;
       }
       else{
        for(int i = 2; i<= Math.sqrt(n); i++){         // optimized way to check for prime
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
       }

        return isPrime;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean isPrime = isPrime(n);
        if(isPrime == true){
            System.out.println("The number is prime ");
        } else{
            System.out.println("The number is not prime ");
        }

        sc.close();
    }
}
