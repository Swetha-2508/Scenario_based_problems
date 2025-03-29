/* Bank management */
import java.util.Scanner;
class sav_acct extends Scenario_1
{
    Scanner sc=new Scanner(System.in);
    void withdrawal(double balance)
    {
        double updbalance;
        System.out.println("Enter the withdrawal amount");
        double withdrawal=sc.nextDouble();
        if (withdrawal<=balance)
        {
            updbalance=balance-withdrawal;
            System.out.println("Your balance is :"+updbalance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    void interest(double balance)
    {
        double interest;
        double rate=0.10;
        interest=(balance*(1+(rate/100)))-balance;
        System.out.println("Your interest is:"+interest);
    }
    void cheque()
    {
        System.out.println("Cheque book facillity is not provided");
    }
}
class curr_acct extends Scenario_1
{
    void cheque()
    {
        System.out.println("Cheque book facility is provided");
    }
    void minbalance(double balance)
    {
        if (balance<=500)
        {
            double uppbalance=balance-50;
            System.out.println("Minimum balance is not maintained");
            System.out.println("Your balance:"+uppbalance);
        }
        else
        {
            System.out.println("Minimum balance is maintained");
        }
    }
}
class Scenario_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double balance;
        System.out.println("Enter customer name");
        String name=sc.nextLine();
        System.out.println("Enter account number");
        long num=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter type of account(savings or current)");
        String type=sc.nextLine();
        System.out.println("Enter balance");
        balance=sc.nextDouble();
        System.out.println("Need to deposit");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.println("Enter your choice (1 or 2)");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter deposit amount");
                double deposit=sc.nextDouble();
                balance+=deposit;
                System.out.println("Your updated balance"+balance);
                break;
            case 2:
                System.out.println("Thanks for your response");
                break;
        }
        sav_acct c1=new sav_acct();
        curr_acct c2=new curr_acct();
        if(type=="savings");
        {
            c1.withdrawal(balance);
            c1.interest(balance);
            c1.cheque();
        }
        if(type=="current")
        {
            c2.cheque();
            c2.minbalance(balance);
        }
    }
}
