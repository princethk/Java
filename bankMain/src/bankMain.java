import java.util.*;
public class bankMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BankAccount acc[]=new BankAccount[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble();

            acc[i]=new BankAccount(a,b,c);
        }
       // System.out.println("Enter withdraw accNo- ");
        int wa=sc.nextInt();sc.nextLine();
        double ans1=withdraw(acc,wa,sc);
        if(ans1==-2){
            System.out.println("Account not found");
        }
        int da = sc.nextInt();sc.nextLine();
        double ans2 = deposit(acc,da,sc);

        if(ans1>0)
        {
            System.out.println(ans1);
        }
        else if(ans1==-1)
        {
            System.out.println("Sorry - Insufficient balance");
        }

        if(ans2 == -1)
        {
            System.out.println("Sorry - Account not found");
        }
        else
        {
            System.out.println(ans2);
        }
    }

    public static double withdraw(BankAccount acc[],int accNo,Scanner sc){
        for(int i=0;i<acc.length;i++){
            if(acc[i].getAccountNumber()==accNo){
                double w=sc.nextDouble();
                if(acc[i].getBalance()>=w){
                    double ub=acc[i].getBalance()-w;
                    return ub;
                }else
                return -1;
            }
        }
        return -2;
    }

    public static double deposit(BankAccount acc[],int accNo,Scanner sc){
        for(int i=0;i<acc.length;i++){
            if(acc[i].getAccountNumber()==accNo){
                double d=sc.nextDouble();
                double ub=acc[i].getBalance()+d;
                return ub;
            }
        }
        return -1;
    }
}
class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}