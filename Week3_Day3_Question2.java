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
        int b=obj.nextInt();
        int fact=1;
        switch(b){
            case 1:
                if(b%2==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                break;
            case 2:
                if(b%2!=0) {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                break;
            case 3:
                for(int i=2;i<b/2;i++){
                    if(b%i==0){
                        System.out.println("NO");
                    }
                    else
                        System.out.println("YES");
                }
                break;
            case 4:
                for(int i=1;i<=a;i++)
                {
                    fact=fact*i;
                }
                System.out.println(fact);
                break;
        }
    }
}
