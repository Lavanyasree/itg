
package arrays;
import java.util.*;
import java.io.*;
public class MatrixAdd {
    public static void main(String args[])
    {
       int n;
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the range");
       n=sc.nextInt();
       int arr[][]=new int[n][n];
       int arr1[][]=new int[n][n];
       int arr2[][]=new int[n][n];
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
               arr[i][j]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
               arr1[i][j]=sc.nextInt();
       }
       System.out.println("The sum of matrices");
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               arr2[i][j]=arr[i][j]+arr1[i][j];
                      System.out.print(+arr2[i][j]+"\t");
       
           }
           System.out.println("");
    }
       
    
    }
}
