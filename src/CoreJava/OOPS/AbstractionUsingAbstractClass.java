package CoreJava.OOPS;
/*
Mini Project: Vehicle Rental System

A rental company rents different types of vehicles:
    Car
    Bike
    Truck

Each vehicle:
    Has a rental price per day
    Must calculate rental cost
    Has a method to display details
    But calculation logic differs per vehicle.

*/

abstract class Vehicle {

    //Abstract methods = must be implemented (variable behavior)
    abstract double cost(int days);

    //Concrete methods = reusable behavior (common functionality)
    public void displayDetails(int days){
        System.out.println("Number of days rented " + days);
        System.out.println("Total rent " + cost(days));
    }
}

class Car extends Vehicle {
    protected int price;

    Car(int price){
        this.price=price;   //to need to super() as there is no constructor in parent class.
    }

    @Override
    public double cost(int days){
        return days*price;
    }

    public void displayDetails(int days){
        System.out.println("Car is rented for " + days);
        System.out.println("Total rent for Car is: " + cost(days));
    }
}

class Bike extends Vehicle {
    public static double price=2000;

    @Override
    public double cost(int days){
        return days*price+100;
    }

    public void displayDetails(int days){
        System.out.println("Bike is rented for " + days);
        System.out.println("Total rent for Bike is: " + cost(days));
    }
}

class Cycle extends Vehicle {

    @Override
    public double cost(int days){
        return 100*days;
    }
}

class Truck extends Vehicle {
    public static double price=3000;

    @Override
    public double cost(int days) {
        return days*price+350;
    }

    public void displayDetails(int days){
        System.out.println("Truck is rented for " + days);
        System.out.println("Total rent for Truck is: " + cost(days));
    }
}

public class AbstractionUsingAbstractClass{
     public static void main(String[] args){

         Vehicle a = new Car(3000); // price is passed via constructor
         a.displayDetails(3);

         Vehicle b = new Bike();
         b.displayDetails(6);

         Vehicle c = new Truck();
         c.displayDetails(2);

         Cycle d = new Cycle();  // still prints parent class method as it is not overridden in child class.
         d.displayDetails(4);
    }
}


