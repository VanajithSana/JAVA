import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ques1{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
        if(password.length()<=1){
            System.out.println("Wrong Input");
            return;
        }
        String newp=password.replace(" ","$");
        System.out.println(newp.toLowerCase());
    }
}
