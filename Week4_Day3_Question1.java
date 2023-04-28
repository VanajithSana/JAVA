import java.util.Arrays;
import java.util.Scanner;

public class ques2 {
    public static void main(String... vamsi) {
        Scanner z = new Scanner(System.in);

        
        int size = z.nextInt();

       
        if (size <= 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        int[] arr = new int[size];

       
        for (int i = 0; i < size; i++) {
            
            arr[i] = z.nextInt();

            
            if (arr[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
        }

        
        Arrays.sort(arr);
        int secondLargest = arr[size-2];

        
        System.out.println(secondLargest);
    }
}
