import java.util.*;
class PalindromeStringOrNot{
    static String display(String a){
        
        for(int i=0; i<a.length()/2; i++){
        if (a.charAt(i)!=a.charAt(a.length()-1-i)) {
                return "False";
            }
        }
        return "True";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(display(word));
        }
        
    }
