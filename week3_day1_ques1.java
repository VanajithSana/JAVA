import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class quesn1 {

    public static void main(String[] args)

    {

    Scanner obj=new Scanner(System.in);

    String x=obj.nextLine();    

    char c=obj.next().charAt(0);

    int a=0;

    for(int i=0;i<x.length();i++)

    {

        if(x.charAt(i)==c)    

        a++;

    }

        System.out.println(a);

        

    }

}
