import java.util.Scanner;

abstract class Account_No {
    public void Account_No(){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Your Account No");
        String accNo = src.nextLine();
        System.out.println("Your Account Number is: " + accNo);
    }
}