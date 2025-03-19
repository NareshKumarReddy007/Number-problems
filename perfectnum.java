import java.util.Scanner;
class perfectnum
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=0;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            fact = fact + i;
        }
    }
        if(n==fact)
        {
             System.out.println("num is perfect num:"+fact);
        }
        if(n<fact)
        {
             System.out.println("deficent number");
        }
        if(n>fact)
        {
             System.out.println("abudent num");
        }
    
}
}
