import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ques2 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<2;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" "); 
        }
            System.out.println(); 
        } 

        
    }
}
