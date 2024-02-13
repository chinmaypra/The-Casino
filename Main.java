import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //Make instantiations
        Scanner input = new Scanner(System.in);
        Stats stats = new Stats();
        int choice = 0;
        
        System.out.println("How much money are you brining to the casino?");
        double money = input.nextDouble();
        BankAccount bankAccount = new BankAccount(money);
        while(choice!=-1){
            
            System.out.println("Please enter your choice/Which game you would like to play?:");
            System.out.println("-1: Quit");
            System.out.println("0: Display Stats");
            System.out.println("1: Blackjack");
            choice = input.nextInt();

            if(choice==-1){
                System.out.println("Thanks for playing! Here are your final stats:");
                calcStats(stats, bankAccount);
            }
        }


    }

    public void calcStats(Stats s, BankAccount b){
        System.out.println("Total Wins: " + s.getWins());
    }
}
