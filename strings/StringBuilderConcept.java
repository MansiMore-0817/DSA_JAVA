// We use StringBuilder cuz the strings ds are ineffecient and Tc is too high in quadratic...as strings are immutable....
// So instead strings we can even use StringBuilder..... but the type of StringBuilder is not string but we can convert it to string using .toString function


public class StringBuilderConcept {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("");

        for(char ch ='a'; ch<= 'z'; ch++ ){
            sb.append(ch);
        }
        // TC = O(26)
        // But if we take string and instead of append we take += then we get TC = O(26 * n^2)

        System.out.println(sb);
        System.out.println(sb.length());

    }
}
