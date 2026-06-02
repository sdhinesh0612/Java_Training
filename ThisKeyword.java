public class ThisKeyword {
    String name;
    void display(String name){
        this.name=name;// this keyword alls intance variable.
        
    }
    public static void main(String[] args) {
       ThisKeyword obj = new ThisKeyword();
       obj.display("Dhinesh");
       System.out.println(obj.name); 
    }
}
