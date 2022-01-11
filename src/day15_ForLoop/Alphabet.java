package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        // A ~ Z ===> on the asci table what are these characters? 65 ~ 90

        for(int i = 65; i <= 90; i++){
            System.out.print((char)i + " "); // remove ln form print statement to print in one line
        }

        System.out.println();
        System.out.println("---------------------------------------------------");

        for(char i = 'A'; i <= 'Z' ; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------");

        // Z~A

        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------");

        for(char i = 1; i <= 40; i++){
            System.out.print(i + " ");
        }


    }
}
