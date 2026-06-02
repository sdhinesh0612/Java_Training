public class ClsAndObj {
    String name;
    int age;

    public void display(){
        System.out.println("Name : "+name+"\nAge : "+age);
    }
    public static void main(String[] args) {
        ClsAndObj object1 = new ClsAndObj();
        object1.display();
    }
}
