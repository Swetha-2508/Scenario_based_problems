/* Saru is assigned a task to determine the type of a given positive integer. The types are defined as follows:
If the sum of its proper divisors is equal to the number itself, it is classified as a 'Perfect number'.
If the sum of its proper divisors is less than the number, it is classified as a 'Deficient number'.
If the sum of its proper divisors is greater than the number, it is classified as an 'Abundant number'. */
import java.util.Scanner;
class Scenario_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect number");
        }
        if(sum<n)
        {
            System.out.println("Deficient number");
        }
        if(sum>n)
        {
            System.out.println("Abundant number");
        }
    }
}
