/* A baker has a cupcake recipe that yields 12 cupcakes, with the following ingredient quantities: 2.5 cups of flour, 1 cup of sugar, and 0.5 cups of butter. 
Write a program to calculate the amounts of flour, sugar, and butter needed for a different number of cupcakes. Provide the ingredient quantities for a specified number of cupcakes, maintaining the original proportions of the recipe. */
import java.util.Scanner;
class Scenario_8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double flour,sugar,butter;
        double num=(int)(n);
        flour=(num*2.5)/12;
        sugar=(num*1)/12;
        butter=(num*0.5)/12;
        String totalflour=String.format("%.2f",flour); //roundof to two decimals
        String totalsugar=String.format("%.2f",sugar);
        String totalbutter=String.format("%.2f",butter);
        System.out.println("Flour: "+totalflour+" cups");
        System.out.println("Sugar: "+totalsugar+" cups");
        System.out.println("Butter: "+totalbutter+" cups");
    }
}
