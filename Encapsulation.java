class BankAccount{
    private double balance = 0;
    public void setBalance(int amount){
        balance+=amount;
    }
    public double getBalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount object = new BankAccount();
        object.setBalance(1000);
        System.out.println(object.getBalance());
    }
}