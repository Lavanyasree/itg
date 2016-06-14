
package arrays;
import java.util.*;
import java.io.*;
public class Bubblesort {
    public static void main(String args[])
    {
        int n,temp;
        System.out.println("Enter the range");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;                        
            }
            }
        }
        System.out.println("The array after sorting");
        for(int i=0;i<arr.length;i++)
        System.out.println(+arr[i]);      
    }
}
