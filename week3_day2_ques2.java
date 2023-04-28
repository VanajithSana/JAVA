import java.io.*;
import java.util.*;

public class ques2 {

    public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
           int a=z.nextInt();
        if(a<0)
        {
            System.out.print("Invalid Input");
        }
        else if(a>0)
        {
             
            int q=1;
            for(int j=0;j<a;j++)
            {
                for(int i=0;i<q;i++)
                {
                    System.out.print("&");
                }
                q++;
                System.out.println();
            }
}
    }
}
