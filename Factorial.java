import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=1;
        while(n==1)
        {
            System.out.println("Enter a number");
            int num=sc.nextInt();
            int factorial=1; //initialising factorial variable before loop (updated factorial value will be stored)
            for(int i=1;i<=num;i++)
            {
                factorial=factorial*i;
            }
            System.out.println(factorial);
            System.out.println("Need to continue for next number.Enter one");
            n=sc.nextInt();
        }
    }
}
