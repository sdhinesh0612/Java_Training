import java.util.*;
public class StringToChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i)+" ");
        }
        //or
        /*for(char c:name.toCharArray()){
            System.out.println(c);
        }*/
    }
}
