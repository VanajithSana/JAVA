import java.io.*;

import java.util.*;

public class Solution {

 public static void main(String[] args) {

 Scanner z=new Scanner(System.in);

 String []sex=new String [4];

 String []why=new String [4];

 int c=0;

 for(int i=0;i<4;i++)

 {

 sex[i]=z.next();

 }

 for(int i=0;i<4;i++)

 {

 why[i]=z.next();

 }

 for(int i=0;i<4;i++)

 {

 for(int j=0;j<4;j++)

 {

 if((sex[i].equals(why[j])))

 {

 c++;

 }

 }

 }

 System.out.println(c);

 }

}
