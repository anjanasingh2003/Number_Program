import java.util.Scanner;
public class Number13
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
           int start=sc.nextInt();
           int end=sc.nextInt();
           int sum=0;
           for(int i=start; i<=end; i++)
           {
            if(i%2==0)
            {
               System.out.println("even number is:"+ i);
               sum=sum+i;
             }
            }
            System.out.println("sum is :" + sum);

      sc.close();
  }
    
}



