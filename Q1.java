import java.util.Scanner;
class BankAccount{
    private int accountnumber;
    private String accountholdername;
    private double balance;
    public BankAccount(int accountnumber, String accountholdername, double balance){
        this.accountnumber = accountnumber;
        this.accountholdername = accountholdername;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("deposited: " + amount);
        }else{
            System.out.println("invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdrawn: " + amount);
        }else{
            System.out.println("insufficient balance");
        }
    }
    public double checkBalance(){
        return balance;
    }
    public void displayAccount(){
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Account Holder: " + accountholdername);
        System.out.println("Balance: " + checkBalance());
    }
}
public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(accNo, name, initialBalance);
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println();
        account.displayAccount();
        sc.close();
    }
}