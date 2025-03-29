/*Raj wants to create a program using pointers and a structure named Employee to manage employee information. 
He seeks your assistance to input the employee's name, salary, and hours worked. Implement a salary increase based on hours worked, and calculate the final salary. Calculate the total salary for 30 days. Display the results of the final and total salary.
Salary increase criteria:
If hours worked >= 12, the increase is Rs. 150.00.
If hours worked >= 10, but less than 12, the increase is Rs. 100.00.
If hours worked >= 8, but less than 10, the increase is Rs. 50.00.
If hours worked < 8, there is no increase. */
import java.util.Scanner;
class Scenario_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double num=sc.nextDouble();
        int hour=sc.nextInt();
        if(hour>=12)
        {
            num=num+150.00;
        }
        else if(hour>=10&&hour<12)
        {
            num=num+100.00;
        }
        else if(hour>=8&&hour<10)
        {
            num=num+50.00;
        }
        else
        {
            num=num+0.00;
        }
        System.out.println("Final Salary: Rs. "+num+"0");
        double salary=num*30;
        System.out.println("Total Salary: Rs. "+salary+"0");
    }
}

        
        

    

        
 
