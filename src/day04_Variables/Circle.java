package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, area, diameter, perimeter

        double PI = 3.14;
        double radius = 5.5;
        double diameter = radius * 2; //5.5 * 2
        double area = radius * radius * PI; //5.5 * 5.5 * 3.14
        double perimeter = diameter * PI; //5.5 * 3.14

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("diameter = " + diameter);
        System.out.println("radius = " + radius);




    }
}

/*3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = diameter * PI

 */