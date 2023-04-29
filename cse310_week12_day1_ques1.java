import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner cv=new Scanner(System.in);
        String sq=cv.nextLine();
        int n1=sq.length();
        int n=cv.nextInt();
        if(n>0)
        {
            if(n<n1)
            {
                System.out.println("Valid string");
            }
        }
    }
}
