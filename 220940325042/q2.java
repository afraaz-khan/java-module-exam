import java.util.Scanner;
import java.util.*;
class showError extends Exception{
    showError(String s){
        super(s);
        System.out.println(s);
    }
}

class BankAccount{
    int accno;
    double balance;
    BankAccount(int accno, double balance){
        this.accno = accno;
        this.balance = balance;
    }

    double getbalace(){
        return this.balance;
    }

    void withdraw(int amt){
        this.balance = this.balance - amt;
        System.out.println("Amount Rs. " + amt + " is Withdrawn from Account number = " + this.accno);
    }

    void deposit(int amt){
        this.balance = this.balance + amt;
        System.out.println("Amount Rs. " + amt + " is Deposited from Account number = " + this.accno);
    }

    void show(){
        System.out.println("Amount in Account No " +  this.accno +" is Rs. " + this.balance);
    }
}

public class q2 {
    public static void main(String[] args) throws showError {
        Scanner sc = new Scanner(System.in);

        System.out.println("*******************Welcome to the Bank*****************");
        System.out.print("Enter Account Number = ");
        int ac_no = sc.nextInt();

        System.out.print("Enter Balance = ");
        int bal = sc.nextInt();

        BankAccount obj = new BankAccount(ac_no, bal);

        System.out.println();
        System.out.println("1. Widthdraw");
        System.out.println("2. Deposit");
        System.out.println("3. View Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your Choice = ");
        int choice = sc.nextInt();
        System.out.println();

        while(choice !=4)
        {
            if (choice == 1){
                System.out.print("Enter the amount to withdraw = ");
                int val = sc.nextInt();
                try{
                    if(obj.getbalace() < val){
                        throw new showError("Amount Cannot be less than Balance");
                        //throws Error if balance is less than amount.
                    }
                    else{
                        obj.withdraw(val);
                    }
                }
                catch(Exception e){
                    System.out.println("Exception Caught " + e);
                }
                //Demonstrated the Concept of Exception Handeling in main() function
            }

            else if (choice == 2){
                System.out.print("Enter the amount to Deposit = ");
                int dep = sc.nextInt();
                obj.deposit(dep);
            }

            else if (choice == 3){
                obj.show();
            }

            System.out.println();

            System.out.println("1. Widthdraw");
            System.out.println("2. Deposit");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice = ");
            choice = sc.nextInt();
            System.out.println();
        }

        System.out.println("###############Thank You###############");

    }
}
