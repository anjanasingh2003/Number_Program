import java.util.Scanner;
public class Number16
 {
   static int countDigits(int num)
   {
    int count=0;
    while(num>0)
    {
        int rem=num%10;
        count++;
        num = num/10;
    }
    return count;
   }

   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int res=countDigits(num);
       System.out.println(res);
   }
}
