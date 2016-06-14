
package arrays;
import java.util.*;
import java.io.*;
public class Arrays {
public static void main(String[] args)
    {
      String dctr_name[]={" Lavanya","Komali","Murali","Nikhil"};
      String dctr_desg[]={"Dental","ENT","Physcologist","Dermetologist"};
      int dctr_id[]={1,2,3,4};
      int dctr_salary[]={4000,7000,12000,9000};
      for(int i=0;i<4;i++)
      {
      System.out.println(dctr_name[i]+"\t"+dctr_id[i]+"\t"+dctr_desg[i]+"\t"+dctr_salary[i]);
      }
    }
    
}
