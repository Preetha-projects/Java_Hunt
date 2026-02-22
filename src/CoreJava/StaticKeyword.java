package CoreJava;

/*
1. The static keyword in Java is used for memory management(Created once when class is loaded) and belongs to the class rather than any specific instance
2. Static variable is also known as class variable, it is shared among all the objects of the class.
3. Static methods and variables can’t access non-static members directly. But non-static members can access static variable directly
4. Static methods can’t be overridden because they belong to the class, not instances.
5. Commonly used for utility or helper methods, constants, and shared resources

 By declaring main() as static, we allow the JVM to load the class into memory and call the main() method directly.
 */

//    Static = belongs to class
//    Non-static = belongs to object

public class StaticKeyword {
    int num =10;
    String name = "anuj";
    static String company = "Techie park";

    public static void main(String[] args) {
        System.out.println("Static Keyword in Java");

        //Accessing static variable directly
        System.out.println("Company Name: " + company);

        //Accessing non-static variable - need to create object of the class
        StaticKeyword obj = new StaticKeyword();
        System.out.println("Employee Name: " + obj.name);
        System.out.println("Employee Number: " + obj.num);

        company = "Techie Park Solutions"; //modifying static variable
        System.out.println("Updated Company Name: " + company);

        //Accessing non-static method - need to create object of the class
        StaticKeyword newCom = new StaticKeyword();
        newCom.newcompany();
    }

    public void newcompany(){
        //Can access static variable directly
        System.out.println("Updated name:"+ company);
    }
}
