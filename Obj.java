class Car{
    String Brand;
    int Speed;

    void drive(String a, int b){
        Brand = a;
        Speed = b;
        System.out.println(" Brand : "+Brand+"\n Speed : "+Speed);
    }
}
public class Obj {
    public static void main(String[] args) {
    Car cc = new Car();
    cc.drive("B M W", 250);
    }
}
