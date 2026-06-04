class Student{
    private String name;
    private int age;
    private double salary;
    public void setDetails(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void getDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}
public class Test1 {
   public static void main(String[] args) {
        Student obj = new Student();
        obj.setDetails("Dhinesh",21,60000);
        obj.getDetails();
   } 
}
