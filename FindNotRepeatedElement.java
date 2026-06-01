import java.util.*;
public class FindNotRepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = new String[1];
        word[0]= sc.nextLine();
        for(int i=0; i<word[0].length(); i++){
            int count=0;
            for(int j=0; j<word[0].length(); j++){ 
                if (word[0].charAt(i)==word[0].charAt(j)) {
                    count++;
                } 
            }
            if (count==1) {
                    System.out.print(word[0].charAt(i)+" ");
                }
        } 
    }
}
