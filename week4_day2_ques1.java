import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int a = z.nextInt();

        
        if (a< 0) {
            System.out.println("Invalid Array Size");
            return;
        }


        double[] doubleArray = new double[a];
        for (int i = 0; i < a; i++) {
            doubleArray[i] = z.nextDouble();
        }

        
        int[] intArray = new int[a];
        for (int i = 0; i < a; i++) {
            if (doubleArray[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
            intArray[i] = (int) doubleArray[i];
        }

  
        for (int i = 0; i < a; i++) {
            System.out.println(intArray[i]);
        }

       
        z.close();
    }
}
