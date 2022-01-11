package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); // creates a new string object

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "Johnssmith@yahoo.com";
        email = email.replace("yahoo", "gmail"); // re-assign variable

        System.out.println("email = " + email);

        String sentence = "Java Java Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "");
        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("  ", " ");
        System.out.println("sentence2 = " + sentence2);

    }
}
