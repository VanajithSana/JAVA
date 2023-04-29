

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class quesn {

    public static void main(String[] args) {

      

            Scanner obj=new Scanner(System.in);

            int n=obj.nextInt();

            String[] a=new String[n];

        if(n<=0){

            System.out.println("Invalid");

        }

        else{

            for(int i=0;i<n;i++){

            a[i]=obj.next();

        }

        int ni=0;

        int ns=0;

        for(int i=0;i<n;i++){

            if(a[i].matches("\\d+")){

                ni++;

            }

            else{

                ns++;

            }

        }

        System.out.println(ni);

        System.out.println(ns);

    }

}

}
