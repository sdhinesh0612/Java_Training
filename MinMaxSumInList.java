import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxSumInList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        int MinimumSum=0;
        int MaximumSum=0;
        for(int i=0; i<list.size()-1; i++){
            MinimumSum = MinimumSum+list.get(i);
        }
        System.out.println(MinimumSum);
        for(int i=1; i<list.size(); i++){
            MaximumSum = MaximumSum+list.get(i);
        }
        System.out.println(MaximumSum);
    }
}
