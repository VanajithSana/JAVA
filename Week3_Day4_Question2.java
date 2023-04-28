import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class ques2 {

    public static void main(String[] args) {

        Scanner z=new Scanner(System.in);

        

        

    float amt=z.nextInt();

        amt=(amt/10)+amt;

        

        float e=amt/12;

        

        e=e*100;

        int e1=(int)e;

        e=(float)e1/100;

        int amt1=(int)amt;

        

        System.out.println(amt1);

        

        System.out.println(e);

    }

}
