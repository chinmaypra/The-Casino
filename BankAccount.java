public class BankAccount {
    private double money;

    public BankAccount(double m){
        money = m;
    }

    public void depositMoney(double m){
        money+=m;
    }
    public void withdrawMoney(double m){
        money-=m;
    }
}
