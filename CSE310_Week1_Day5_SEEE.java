import java.io.*;
import java.util.*;

public class ques1 {

    public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
        int a=z.nextInt();
        int b=z.nextInt();
        if((a<0)||(b<0))
        {
        System.out.println("0");
        }
        else
        {
            System.out.println((a*4)+(b*6));
        }
        
    }
}
