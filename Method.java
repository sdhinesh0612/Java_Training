public class Method {
    int Display(int a,int b){
        int c = a+b;
        
        return c;
    }
    static void Display(int y){
        y=100;
        System.out.println(y);//inner method y
    }
    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println(obj.Display(10,20));
        int y = 6;
        Display(y);
        System.out.println(y);//outer y
    }
}
