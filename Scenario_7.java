/*Daniel is a mathematics enthusiast and a programming whiz. He is fascinated by perfect cubes and is working on a program to find the immediate perfect cube less than a given number. */
import java.util.Scanner;
class Scenario_7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        int m=0;
        for(int i=1;i<=n;i++)
        {
            t=i*i*i;
            if(n<=t)
            {
                m=(i-1)*(i-1)*(i-1);
                break;
            }
        }
        System.out.println(m);
    }
}
