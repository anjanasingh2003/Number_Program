import java.util.Scanner;
public class Number15
{
  static int sumDigits(int num)
  { 
    int sum=0;
    while(num>0)
    {
    int rem=num%10;
    sum = sum+rem;
    num = num/10;
    }
    return sum;
  }
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           int res = sumDigits(num);
            System.out.println(res);
  }
    
}
