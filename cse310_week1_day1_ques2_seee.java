import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ques2 {

    public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
        double q=z.nextDouble();
        double w=z.nextDouble();
        double e=z.nextDouble();
        double s=((q+w+e)/3);
        System.out.printf("%.1f",s-0.1);
    }
}


