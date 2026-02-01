public class substring {
    
    public static String getSubstring(String str, int si, int ei){
        String subString = "";
        for(int i = si; i < ei; i++){
            subString += str.charAt(i);
        }

        return subString;
    }



    public static void main(String [] args){
        String str = "HelloWorld";

        System.out.println(getSubstring(str, 0, 4));
    }

}
