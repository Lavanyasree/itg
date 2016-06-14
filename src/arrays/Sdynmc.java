
package arrays;
import java.util.*;
import java.io.*;
public class Sdynmc {
    public static void main(String args[])
    {
        int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of records to be displayed");
     a=sc.nextInt();
        String dctr_name[]=new String[a];
        String dctr_desg[]=new String[a];
        int dctr_id[]=new int[a];
        int dctr_sal[]=new int[a];
         System.out.println("Enter the information"); 
        for(int i=0;i<a;i++)
        {      
            dctr_name[i]=sc.next();
            dctr_desg[i]=sc.next();
            dctr_id[i]=sc.nextInt();
            dctr_sal[i]=sc.nextInt();
            System.out.println("\t "+dctr_name[i]+" \t"+dctr_desg[i]+"\t "+dctr_id[i]+"\t"+dctr_sal[i]);
        }
    }
}
