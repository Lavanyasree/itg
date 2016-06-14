
package arrays;
import java.util.*;
import java.io.*;
public class TwoDmns {
    public static void main(String args[])
        {
    String dctr_name[][]={{"Potti","Lavanya","Harsha","komali"},{"Nikhil","Harish","Vamsi","Vardhan"}};
    int dctr_id[][]={{1,2,3,4,},{5,6,7,8}};
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<4;j++)
            System.out.println(dctr_name[i][j]+"\t"+dctr_id[i][j]);
    }
    }
}
