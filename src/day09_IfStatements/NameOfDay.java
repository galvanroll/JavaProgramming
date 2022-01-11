package day09_IfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        int n = 5; // 1 ~ 7 name a day Monday - Sunday

        if( n == 1) { // 1 if block
            System.out.println("Monday");
            // day = "Monday"; --> can use this then use 1 print statement = System.out.println("day = " + day);
        }else if(n == 2) { // 5 else if blocks
            System.out.println("Tuesdya");
            // day = "Tuesday";
        }else if(n == 3){
            System.out.println("Wednesday");
            // day = "Wednesday";
        }else if(n == 4) {
            System.out.println("Thursday");
            // day = "Thursday";
        }else if(n == 5) {
            System.out.println("Friday");
            // day = "Friday";
        }else if(n == 6) {
            System.out.println("Saturday");
            // day = "Saturday";
        } else { // 1 else block
            System.out.println("Sunday");
            //day = "Sunday";
        }

        }




    }

