import java.util.Scanner;
public class Number11
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
            int sum=0;
            int avg=0;
           for(int i=1; i<=n; i++)
           {
              sum=sum+i;
              avg= sum/2;
            }
            System.out.println(avg);
      sc.close();
  }
    
}



