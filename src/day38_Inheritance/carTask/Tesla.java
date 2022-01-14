package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand + " " + model + " is breaking down");
    }
    public void race(){
        System.out.println(brand + " " + model + " is racing");
    }

}
