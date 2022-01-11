package day16_ForLoopsStringPractice;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
      // index:       01234567891011
        String result = " "; // contain the reversed version of str

        for (int i = str.length() -1; i >= 0; i--) { //i: index numbers of str (starting last index to index 0)
            result += str.charAt(i);
        }
        /*  result += str.charAt(11); //n
            result += str.charAt(10);
            result += str.charAt(9)..... etc.  */

        System.out.println(result);

    }
}
