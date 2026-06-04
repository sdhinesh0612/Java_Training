import java.util.*;
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word =sc.nextLine();
        String[] words = word.split(" ");
        System.out.println(words[words.length-1].length());
        }

    }