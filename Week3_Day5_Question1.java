import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        double n=obj.nextDouble();
        int m=obj.nextInt();
        switch(m)
        {
            case 1:
                double o=obj.nextDouble();
                if(o<n)
                {
                    System.out.printf("%.2f",n-o);
                }
                else
                {
                    System.out.println("Error");
                }
                break;
            case 2:
                double oo=obj.nextDouble();
                System.out.printf("%.2f",n+oo);
                break;
            case 3:
                System.out.println(n);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
