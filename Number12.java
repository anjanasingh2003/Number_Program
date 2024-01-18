import java.util.Scanner;
public class Number12
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
            int sum=0;
            int avg=0;
           for(int i=0; i<n; i++)
           {
              sum=sum+i;
              avg= sum/2;
            }
            System.out.println(avg);
      sc.close();
  }
    
}




