package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {
        boolean a = false;

        for(int i = 0; a;){ // for loop - if you know the exact number of repeatings
            System.out.println("Wooden Spoon");
        }
        System.out.println("------------------------------------------");

        while(a){ // while loop
            System.out.println("Wooden Spoon");
        }
        System.out.println("------------------------------------------");

        do{ // do-while loop
            System.out.println("Wooden Spoon");
        }while(a);
    }
}
