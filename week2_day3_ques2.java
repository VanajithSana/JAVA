import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int ch=obj.nextInt();
        int ca=obj.nextInt();
        int p=(ca*100)/ch;
        if(p>=75){
            System.out.println(p);
            System.out.println("Yes");
        }
        else{
            System.out.println(p);
            System.out.println("No");
        }
    }
}
