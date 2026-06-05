import java.util.*;

public class FindCommonElements {
    public static void main(String[] args) {
        String word = "Banana";
        char[] arr = word.toCharArray();
        Set<Integer> s = new Set();
        for(int i=0; i<arr.length; i++){
            if (s.contains(arr[i])) {
                s.remove(arr[i]);
            }
            else{
                s.add(arr[i]);
            }
        }
    }
}
