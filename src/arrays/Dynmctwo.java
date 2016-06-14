
package arrays;
import java.util.*;
import java.io.*;
public class Dynmctwo {
    public static void main(String  args[])
    {
    int n,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of records");
    n=sc.nextInt();
    String dctr_name[][]= new String[n][n];
    int dctr_id[][]=new int[n][n];
    System.out.println("Enter the information");
    for(int i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            dctr_name[i][j]=sc.next();
             System.out.println("The records information is"+dctr_name[i][j]);
            }
    }
    for(int i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
               dctr_id[i][j]=sc.nextInt();
         System.out.println("The records information is"+dctr_id[i][j]);
    }
    
   
    }
}
