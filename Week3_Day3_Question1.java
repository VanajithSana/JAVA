import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        int am=obj.nextInt();
        if(am%100!=0){
            System.out.println("Invalid Input");
            return;
        }
        int[] n={2000,500,200,100};
    int[] count=new int[4];

    for(int i=0;i<4;i++) {
      if(am>=n[i]) {
        count[i]=am/n[i];
        am=am%n[i];
      }
    }

    for(int i=0;i<4;i++) {
      if(count[i]!=0) {
        System.out.println(count[4-i] + " " + n[4-i] + " Notes");
      }
    }
  }
}
