import java.util.Scanner;
public class Number5
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
           int start=sc.nextInt();
           int end=sc.nextInt();
            int sum=0;
           for(int i=start; i<=end; i++)
           {
              sum=sum+i;
            }
            System.out.println(sum);
      sc.close();
  }
    
}

