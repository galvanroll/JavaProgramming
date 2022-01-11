package day16_ForLoopsStringPractice;

public class DigitsLetterSpecialChar {

    public static void main(String[] args) {

        String str = "Cydeo123456School!@#$%WoodenSpoon";

        //12345
        //CydeoWoodenSpoon
        //!@#$%

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str(0~last index)

            char ch = str.charAt(i); // ch: is all the characters that are in str

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else if(ch >= 'a' && ch <= 'z'){
                letters += ch;
            }else{
                specialChars += ch;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);


    }
}
