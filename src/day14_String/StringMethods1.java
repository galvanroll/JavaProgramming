package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "    batch 25     "; // has white spaces which means unused spaces
        str1 = str1.trim(); // "batch 25" --> re-assign variable.. str1 = str1.trim();

        System.out.println(str1);

        String str2 = "Cydeo School";
        str2.indexOf("h"); // returns you the index number of character

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language"; // the spaces are counted as well
        int n3 = str3.indexOf("ang");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("--------------------------------------------");

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a"); // if you want to find the second a type ("a ")
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.indexOf("ava W"); // int fourth = s.lastIndexOf("av");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);




    }
}
