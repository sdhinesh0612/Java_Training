abstract class A {
    abstract void display();
}
class B extends A {
    @Override
    void display() {
        System.out.println("Hello World");
    }
}
class C extends A {
    @Override
    void display() {
        System.out.println("Welcome to Java");
    }
}
public class AbstractEx {
    public static void main(String[] args) {
        A obj1 = new B();
        A obj2 = new C();
        obj1.display();
        obj2.display();
    }
}
