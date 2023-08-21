import java.util.Scanner;

public class Main extends BankingSystem{

    int balance;
    @Override
    void deposit() {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Amount to deposit");
        int amount = src.nextInt();
        System.out.println("You Deposit :" + amount);
        balance+=amount;
    }
    void checkBalance() {

        System.out.println("Your Account Balance: " + balance);
    }

    @Override
    void withdraw() {
         Scanner src = new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw");
        int withDraw = src.nextInt();
        System.out.printf("You WIthdraw : " + withDraw);
        balance-=withDraw;
        System.out.println("");
        System.out.println("Your Balance is:" + balance);
    }

    public static void main(String[] args) {

        Main b = new Main();
        b.Account_No();
        b.deposit();
        b.checkBalance();
        b.withdraw();

    }
}