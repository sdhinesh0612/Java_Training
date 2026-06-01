import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnnaAndBrain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        int k = scan.nextInt();
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        int Charge = scan.nextInt();
        int Sum=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) != list.get(k)){
                Sum = Sum+list.get(i);
            }
        }
        int Share = Sum/2;
        int ChargeMinus = Charge-Share;
        if (ChargeMinus == Charge) {
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(ChargeMinus);
    }
}
