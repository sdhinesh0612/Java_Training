abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car engine starts...");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike engine starts...");
    }
}
class Bus extends Vehicle{
    void start(){
        System.out.println("Bus engine starts...");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.start();
        obj1= new Bike();
        obj1.start();
        obj1 = new Bus();
        obj1.start();
        
    }
}
