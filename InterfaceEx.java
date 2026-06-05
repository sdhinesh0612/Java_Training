interface A {
    void display();
}
interface B { 
    void display();
}
class C implements A, B {
    @Override
    public void display() {
        System.out.println("Both display methods implemented in class C");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
