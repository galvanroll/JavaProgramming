package day19_LoopPractices;

import org.w3c.dom.ls.LSOutput;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                // break = exits the loop
                //continue = terminates the current iteration of the loop
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");
    }
}

