
PREPARENEW
CERTIFY
COMPETE
Search
 E2003_03 
All Contests  cse310_week7_day4_seee  cse310_week7_day4_ques1
cse310_week7_day4_ques1locked
Problem
Submissions
Leaderboard
Discussions
Submitted 2 months ago • Score: 5.00Status: Accepted
 Test Case #0

Submitted Code
Language: Java 15

 Open in editor
1
import java.io.*;
2
import java.util.*;
3
import java.text.*;
4
import java.math.*;
5
import java.util.regex.*;
6
​
7
public class Solution{
8
    public static boolean canBePalindrome(String str){
9
        int i=0,j=str.length()-1;
10
        while(i<j){
11
            if(str.charAt(i)!=str.charAt(j)){
12
                return isPalindrome(str,i+1,j)||isPalindrome(str,i,j-1);
13
            }
14
            i++;
15
            j--;
16
        }
17
        return true;
18
    }
19
​
20
    private static boolean isPalindrome(String str,int i,int j){
21
        while(i<j){
22
            if(str.charAt(i)!=str.charAt(j)){
23
                return false;
24
            }
25
            i++;
26
            j--;
27
        }
28
        return true;
29
    }
30
​
31
    public static void main(String[] args) {
32
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
33
        Scanner obj=new Scanner(System.in);
34
        String str=obj.nextLine();
35
        if(1<=str.length()||str.length()<=1000){
36
            System.out.println(canBePalindrome(str)); 
37
        }
38
        else{
39
        System.out.println("Invalid Input");
40
        }
41
    }
42
}
Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

