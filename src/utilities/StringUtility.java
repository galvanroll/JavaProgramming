package utilities;

public class StringUtility {

    // prints each character of given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    // reverse the given string and returns the reverse string
    public static String reverse(String str){
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;

}




}
