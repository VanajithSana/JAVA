import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

         Scanner sc = new Scanner(System.in);

        String correctAnswers = sc.nextLine().toUpperCase();

        int n = sc.nextInt();

        sc.nextLine(); // to consume the newline character

        

        // check for invalid input

        if (n <= 0 || correctAnswers.length() != 5 || !correctAnswers.matches("[A-D]+")) {

            System.out.println("Incorrect Input");

            return;

        }

        

        for (int i = 0; i < n; i++) {

            String studentAnswers = sc.nextLine().toUpperCase();

            // check for invalid input

            if (studentAnswers.length() != 5 || !studentAnswers.matches("[A-DX]+")) {

                System.out.println("Incorrect Input");

                return;

            }

            double score = 0.0;

            for (int j = 0; j < 5; j++) {

                if (studentAnswers.charAt(j) == 'X') {

                    // question not attempted

                    continue;

                }

                if (studentAnswers.charAt(j) == correctAnswers.charAt(j)) {

                    // correct answer

                    score += 1.0;

                } else {

                    // incorrect answer

                    score -= 0.25;

                }

            }

            System.out.print(score + " ");

        }

    }

}
