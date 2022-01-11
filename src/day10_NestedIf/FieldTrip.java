package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if(grade >= 1 && grade <= 6){

        if (grade == 1) {
            location = "Apple Orchard";
            groupNumber = 3;
            teacher = "Ms. Smith";
        }else if (grade ==2){
            location = "Zoo";
            groupNumber = 7;
            teacher = "Mr. Lee";
        }

    }else {
            System.out.println("Invalid Grade");
        }

        System.out.println("location - " + location  + "\nnumber of groups - " + groupNumber + "\nteacher in charge - " + teacher);

        /*
        System.out.println("location - " + location);
        System.out.println("number of groups - " + groupNumber);
        System.out.println("teacher in charge - " + teacher);
        */
    }
}
