interface Payment{
    void makePayment();
}
class PhonePay implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Payment made using PhonePay");
    }
}
class GooglePay implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Payment made using GooglePay");
    }
}
class Paytm implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Payment made using Paytm");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Payment payment1 = new PhonePay();
        Payment payment2 = new GooglePay();
        Payment payment3 = new Paytm();

        payment1.makePayment();
        payment2.makePayment();
        payment3.makePayment();
    }
}
