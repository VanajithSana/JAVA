import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args)
{
Scanner z=new Scanner(System.in);
int n=z.nextInt();
double[][] caMarks=new double[n][];
for (int i=0;i<n;i++) {
int CA=z.nextInt();
caMarks[i]=new double[CA];
for (int j=0;j<CA;j++) {
caMarks[i][j]=z.nextDouble();
}
}
int subject=z.nextInt();
double sum=0;
int CA=caMarks[subject-1].length;
for (int i=0;i<CA;i++) {
sum=sum+caMarks[subject-1][i];
}
double average=sum/CA;
System.out.println("Average in Subject-" + subject+ " is " + average);

}
}
