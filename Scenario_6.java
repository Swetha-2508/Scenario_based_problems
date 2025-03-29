/* 
Custom find factors 
Input:
5
1 2 4 6 8
24
Output:
1 2 4 6 8 
*/
import java.util.Scanner;
public class Scenario_6 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(num%arr[i]==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
