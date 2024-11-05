import java.util.*;
public class TransactionMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount[] ac = new BankAccount[2];
        for (int i = 0; i < ac.length; i++) {
            System.out.println("Account "+(i+1)+":");
            System.out.print("Account Number: ");
            String a = sc.nextLine();
            System.out.print("Account Holder Name: ");
            String b = sc.nextLine();
            System.out.print("Balance: ");
            double c = sc.nextDouble();sc.nextLine();
            ac[i] = new BankAccount(a,b,c);
            System.out.println();
        }
        System.out.println("Transfer Details:");
        System.out.print("Amount: ");
        double amount = sc.nextDouble();sc.nextLine();
        System.out.print("Transaction Code: ");
        String tran = sc.nextLine();
        System.out.println();
        BankUtils bu = new BankUtils(ac[0], ac[1], amount, tran);
        System.out.println("Before Transfer:");
        for(int i=0;i<ac.length;i++){
            System.out.println("Account "+(i+1)+": "+ac[i].getAccountHolderName());
        }
    }
    public static double[] transferFunds(BankUtils b){
        if(b.fromAccount.getBalance()>b.getAmount()){
            double amt1=b.fromAccount.getBalance()-b.getAmount();
            double amt2=b.toAccount.getBalance()+b.getAmount();
            double amt[]={amt1,amt2};
            return amt;
        }
        return null;
    }
}
class BankUtils{
    BankAccount fromAccount;
    BankAccount toAccount;
    double amount;
    String transactionCode;

    public BankUtils(BankAccount fromAccount, BankAccount toAccount, double amount, String transactionCode) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.transactionCode = transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }
}
class Transaction{
    String transactionCode;
    double amount;
    String timestamp;

    public Transaction(String transactionCode, double amount, String timestamp) {
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

