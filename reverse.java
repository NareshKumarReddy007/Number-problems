import java.util.Scanner;
class reverse
{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int a,b=0;
        while(n!=0)
        {
            a=n%10;
            b=(b*10)+a;
            n=n/10;
        }
        System.out.println(b);
    }
}
