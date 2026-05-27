public class swapvalues_without_temp {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapped a value: "+a);
        System.out.println("Swapped b value: "+b);
    } 
