package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("Wooden Spoon");
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("-----------------------------------------------");

        for (int j = 0; j < 4; j++) { // outer loop responsibility: to repeat inner loop
        }
        for (int i = 0; i < 4; i++) { // inner loop
            System.out.println("Wooden Spoon");
        }



    }
}
