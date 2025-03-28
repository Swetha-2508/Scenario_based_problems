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
