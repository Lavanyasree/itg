import java.util.*;
import java.io.*;
public class reverse {
    public  static void main(String args[])
    {
    int n,rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
     for(int i=0;i<=n;i++)
     {
         int t=n%10;
         rev=rev*10+t;
         n=n/10;   
     }
     System.out.println("The reverse of given number"+rev);
     }
}
