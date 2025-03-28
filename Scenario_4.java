/* We all know the Fibonacci sequence, each term of it is the sum of the two previous terms. For Example, F(1) = 1, F(2) = 1, F(3) = 2, and so on.
In this problem, we need to find just the last digit of a Fibonacci series termed F(n), where n is the input. 
Write a program using functions to output the last digit of the term F(n). */
import java.util.Scanner;
class Scenario_4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1;
        int n3;
        int arr[]=new int[50];
        arr[0]=1;
        for(int i=1;i<50;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            arr[i]=n3;
        }
        int num=sc.nextInt();
        int find=arr[num-1];
        int value=find%10;
        System.out.println(value);
    }
}
