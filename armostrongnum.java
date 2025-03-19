import java.util.Scanner;
class armostrongnum
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0;
        int temp=n;
        while(n!=0)
        {
            int a=n%10;
             b=b+(a*a*a);
            n=n/10;
        }
        if(temp==b)
        System.out.println("num is armostrng" +b);
        else{
            System.out.println("not a amst  num" );
        }
    }
}
