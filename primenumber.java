import java.util.Scanner;
class primenumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int b=0;
        if(a==0||a==1)
        {
            System.out.println("it is not prime");
        }
        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                b=1;
                break;
            }
        }
        if(b==1)
        {
            System.out.println("number is not a prime");
        }
        if(b==0)
        {
            System.out.println("number is a prime");
        }
    }
}
