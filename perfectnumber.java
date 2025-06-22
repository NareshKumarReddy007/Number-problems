import java.util.Scanner;
 public class perfectnumber {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==number)
        {
            System.out.println("perfect num");
        }
        if(sum<number)
        {
            System.out.println("deficent num");
        }
        if(sum>number)
        {
            System.out.println("abudent num");
        }
    }
}
