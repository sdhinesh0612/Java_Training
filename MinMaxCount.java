import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxCount{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        int Max=list.get(0);
        int Min=list.get(0);
        int MaxCount=0;
        int MinCount=0;
        for(int i=0; i<list.size(); i++){
            if (Max>list.get(i)) {
                Max = list.get(i);
                MaxCount++;
            }
        }
        for(int i=0; i<list.size(); i++){
            if (Min<list.get(i)) {
                Min = list.get(i);
                MinCount++;
            }
        }

        System.out.println(MinCount+" "+MaxCount);
    }
}