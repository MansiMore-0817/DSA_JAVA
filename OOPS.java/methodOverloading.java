public class methodOverloading {
 
        public static void main(String [] args){
            Calculator calc = new Calculator();
            System.out.println(calc.sum(1,2));
            System.out.println(calc.sum(3,4,5 ));
            System.out.println(calc.sum((float)1.2, (float)1.5));   //java, by default, considers decimal values as double, so we need to typecast it to float to make it work with the sum method that takes float as parameters
        }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
