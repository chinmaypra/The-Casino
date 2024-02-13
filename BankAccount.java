public class BankAccount {
    final double INITIAL_MONEY;
    private double money;

    public BankAccount(double m){
        money = m;
        INITIAL_MONEY = m;
    }

    public double getMoney(){
        return money;
    }
    public double getInitialMoney(){
        return INITIAL_MONEY;
    }

    public void depositMoney(double m){
        money+=m;
    }
    public void withdrawMoney(double m){
        money-=m;
    }

    public double calcProfit(){
        return money-INITIAL_MONEY;
    }
}
