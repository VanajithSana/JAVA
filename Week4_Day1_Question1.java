import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ques1 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String sub=obj.nextLine();
        switch(sub){
            case "Java":
                System.out.println("Shruti "+"4");
                break;
            case "OS":
                System.out.println("Puneet Kumar "+"3");
                break;
            case "AI":
                System.out.println("James William "+"2");
                break;
            case "Android":
                System.out.println("Md. Adil Khan "+"3");
                break;
            default: System.out.println("This subject is not running in this semester.");
        }
    }
}
