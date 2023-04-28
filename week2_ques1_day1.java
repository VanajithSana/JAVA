import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
         String w=z.nextLine();
        int q=Integer.parseInt(w,2);
        if (q<65||q>90) {
            System.out.println("INVALID PAPER CODE");
            
        } else {
            System.out.println((char)q);
           
        }
    }
}
