package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {
         int num1 = +25;
         int num2 = -25;

        System.out.println( num1 < 0 );

        int b = 100;
        System.out.println(++b);

        int c = 100;
        System.out.println(c++); //post increment: first passes the current value, then increases the value by 1
        System.out.println(c); //101

        System.out.println("---------------------------------------");
        //Pre Decrement:
         int x = 200;
        System.out.println(--x); // decreases the value by 1 immediately

        // Post Decrement:
        int y = 200;
        System.out.println( y-- ); // first step -> passes the current value
        System.out.println(y); // second step -> decreases value by 1

        System.out.println("--------------------------------------");

        int z =45;

        System.out.println( ++z); //46
        System.out.println( z++); //46
        System.out.println(z);
    }
}
