package day03_EscapeSequence;
/* escape sequence: MUST be with double quote
\n: starts a new line
\t: this gives a paragraph space (tab)
\\: double \\ prints a single \ (backslash)
\": double quote symbol (quote)


 */

public class EscapeSequence {

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("-----------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIts nice to see you all! \nWhat class do we have next week?");

        System.out.println("-----------------------------------------");

        System.out.println("\tJava is a Cool Programming Language");

        System.out.println("------------------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slash

        System.out.println("------------------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); // in order to print double quote we need to use /* escape sequence


    }
}
