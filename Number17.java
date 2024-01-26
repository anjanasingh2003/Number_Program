import java.util.Scanner;
public class Number17 
{
    static int reverse(int num)
    {
        int rev=0;
         while (num>0) 
         {
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
         }
       return rev;
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int res=reverse(num);
       System.out.println(res);
   }
}

