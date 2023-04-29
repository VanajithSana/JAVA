import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        
        String paragraph = z.nextLine();
        String[] input = z.nextLine().split(" ");
        String word = input[0];
        int n = Integer.parseInt(input[1]);
        
        int count = 0;
        int index = -1;
        int lastIndex = -1;
        
        // Loop through the paragraph to find the Nth occurrence of the word
        for (int i = 0; i <= paragraph.length() - word.length(); i++) {
            if (paragraph.substring(i, i + word.length()).equals(word)) {
                count++;
                lastIndex = i;  // update the index of last occurrence
                
                if (count == n) {
                    index = i;  // update the index of Nth occurrence
                    break;
                }
            }
        }
        
        // Print the result
        if (index == -1) {
            if (lastIndex == -1) {
                System.out.println("Not Present");
            } else {
                System.out.println(lastIndex);
            }
        } else {
            System.out.println(index);
        }
        
        z.close();
    }
}
