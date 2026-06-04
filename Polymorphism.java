class Addition{
    int add(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    //method overloading  
    int add(int num1, int num2, int num3){
        int sum=num1+num2+num3;
        return sum;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }
}
