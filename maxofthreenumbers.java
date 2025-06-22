import java.util.Scanner;
class Maxofthreenumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&c==b&&c==a)
        {
            System.out.println("all are equal");
        }
        else if(a>b&&a>c)
            {
                System.out.println("a is max");
                
            }
        else if(b>c&&b>a)
        {
            System.out.println("b is max");
        }
        else
        {
            System.out.println("c is max");
        }
    }
}
