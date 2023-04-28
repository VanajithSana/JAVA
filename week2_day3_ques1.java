import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        float temp=obj.nextFloat();
        if(a==1){
            float c=((temp-32)*5)/9;
            System.out.format("%.2f",c);
        }
        else if(a==2){
            double f=(temp*1.8)+32;
            System.out.format("%.1f",f);
        }
        else{
            System.out.println("INVALID CHOICE");
        }
    }
}
