import java.util.Scanner;
class palendromenum
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
             b=(b*10)+a;
            n=n/10;
        }
        if(temp==b)
        System.out.println("is a palendrom" +b);
        else{
            System.out.println("not a palendrome"+b );
        }
    }
}
