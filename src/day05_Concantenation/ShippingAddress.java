package day05_Concantenation;

public class ShippingAddress {

    public static void main(String[] args) {

        // Declaring multiple variable
       String name = "James King",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr",
                city = "McClean",
                state = "VA",
                zipCode = "22031A";

       // System.out.println(name +  "\n" + buildingNumber + " " + streetName + "\n" + state + "," + " " + zipCode);

        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + state + "," + " " + zipCode;

        System.out.println(address);

    }
}
/*Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */