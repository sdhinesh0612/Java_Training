class Animal{
    void makeSound(){
        System.out.println("Animal make Sound");
    }
}
class Cat extends Animal{
    //method overriding
    @Override //this intimates you are overrinding if you didn't override the function it shows error msg. 
    void makeSound(){
        System.out.println("Meow...");
    }
}
public class OverrideEx {
    public static void main(String[] args) {
        Animal obj = new Cat(); //Animal is reference but object is created for Cat class
        obj.makeSound();
    }
}
