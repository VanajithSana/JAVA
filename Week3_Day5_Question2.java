import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>=0)
        {
            for(int i=0;i<n+1;i++)
        {
            System.out.println(i);
        }
        System.out.printf("Games End");
        }
        else
        {
            System.out.printf("Invalid Input");
        }
    }
}
