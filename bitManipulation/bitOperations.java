
public class bitOperations {


    // get ith bit
    public static int findithBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }


    // set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // clear ith bit
    public static int clearIthBit(int n, int i){

        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // update ith bit
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0 ){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

                    // OR this approach can be used too.. but above and below approach both has same TC
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }


    public static int clearLastIthBits(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }


    public static int clearRangeOfBits(int n, int i, int j){
        int a = ((~0)<< (j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }



    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }


    public static void main(String[] args) {
        
        // System.out.println(findithBit(10, 3));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));


        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearLastIthBits(15, 2));

        // System.out.println(clearRangeOfBits(10, 2, 4));


        System.out.println(isPowerOfTwo(15));
    }
     
}