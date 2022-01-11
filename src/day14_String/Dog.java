package day14_String;

public class Dog {

    public static void main(String[] args) {

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat"); // "Cat..."

        System.out.println("s = " + s);

        String str = "C# is fun, C# is cool";
        str = str.replace(" C#", " Java");

        System.out.println("str = " + str);

        String s3 = "Java";
        s3 = s3.replace("a", "e");

        System.out.println(s3);

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");

        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");

        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o"); // replace last a ex: "va" --> "vo"

        System.out.println(result3);

    }
}
