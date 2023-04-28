import java.io.*;
import java.util.*;

public class ques2 {

    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int totalmarks=0;
        if(n<=0){
            System.out.println("Invalid");
        }
        else{
            for(int i=0;i<n;i++){
                int marks=z.nextInt();
                totalmarks=totalmarks+marks;
            }
            System.out.println(totalmarks);
        }
    }
}
