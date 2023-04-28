import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ques1 {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int count=0,c=0;
        int n=0;
        String a=z.next();
        String b=z.next();
        if(a.length()!=b.length())
        {
            System.out.println("Not Similar");
            System.exit(0);
        }
        else if(a.length()<b.length())
        {
            n=b.length();
        }
        else
        {
            n=a.length();
        }
        //System.out.println(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    count++;
                }
            }
        }
        for(int i=0;i<(n/2);i++)
        {
            for(int j=(n-1);j>=(n/2);j--)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    c++;
                }
            }
        }
        //System.out.println((count-c));
        if((count-c)==n)
        {
            System.out.println("Similar");
        }
        else
        {
            System.out.println("Not Similar");
        }
    }
}
