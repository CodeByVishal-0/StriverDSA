package OOPs;

import java.util.Scanner;

class ATM {
    float balance;
    int pin =5678;
    public void checkPin(){
        System.out.println("Enter Your Pin : ");
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int entered_pin=sc.nextInt();
        if(entered_pin==pin){
            menu();
        }else{
            System.out.println("Enter Valid Pin...");
            checkPin();

        }

    }
    public void menu(){
        System.out.println("Enter Your Choice...");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            withdrawMoney();
        }
        else if(choice==3){
            depositMoney();
        }else if(choice==4){
            return;
        }
        else{
            System.out.println("invalid Choice...");
        }
        
    }
    public void checkBalance(){
            System.out.println("Balance : "+balance);
            menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount to Withdraw : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance...");
            menu();
        }else{
            balance=balance-amount;
            System.out.println("Withdrawl Successful...");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter amount to Deposit");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance+=amount;
        System.out.println("Deposited Successfully");
        menu();
    }
}
public class ATMMachine{
    public static void main(String[] args){
        ATM acc1= new ATM();
        acc1.checkPin();
    }
}
