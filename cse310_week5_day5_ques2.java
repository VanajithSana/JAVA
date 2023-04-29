import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ques2 {
     public static boolean isBigger(int i,int j){
         if(i>j){
             return true;
         }
         else{
             return false;
         }
     }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i=obj.nextInt();
        int j=obj.nextInt();
        boolean c= isBigger(i,j);
        System.out.println(c);
    }
}
