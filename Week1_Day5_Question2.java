import java.io.*;
import java.util.*;

public class ques2 {

    public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
        long n=z.nextLong();
        z.nextLine();
        String name=z.nextLine();
                                 
        char gender=z.next().charAt(0);
        z.nextLine();
        int b=z.nextInt();
        if(b>=20000)
        {
                                 if(gender=='F')
            {
                              System.out.println("Hi Ms. "+name+"!");
                              System.out.println("Insufficient Funds! You can not withdraw "+b+".");
            }
                        else
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+b+".");
            }
        }
                          else
        {
            if(gender=='F')
            {
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+(20000-b)+".");
            }
            else
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+(20000-b)+".");
    }
        }
    }
}
