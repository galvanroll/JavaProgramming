package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Hello", "World"); // --> W.S

    }

    //1. Create a method that can display the initials of the person, initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("initial = " + initial);

    }

    //2. Create a method that can display the domain of the email. domain(String email)

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfTheMonth(int number){

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

            }else{
            name = "Invalid";

            System.out.println("Month name = " + name);
        }







    }
}
