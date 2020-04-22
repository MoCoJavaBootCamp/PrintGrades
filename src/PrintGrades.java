/*
Pseudocode:
import scanner
declare method
declare vars for scanner, exam scores, continue, output, grade
prompt user to enter a score
define while loop
define if statements
define grade based on score
print results
prompt user to continue or quit

 */
import java.util.Scanner;

public class PrintGrades {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int score;
          char cont = 'y';
          String output;

          while (cont == 'y') {
              System.out.println("Enter an exam score: ");
              score = input.nextInt();

              if (score <= 100 && score >= 90) {
                  output = "Good job. Your grade is A.";
              } else if (score <= 89 && score >= 80) {
                  output = "Good job. Your grade is B.";
              } else if (score <= 79 && score >= 70) {
                  output = "Good job. Your grade is C.";
              } else if (score <= 69 && score >= 60) {
                  output = "Good job. Your grade is D.";
              } else {
                  output = "Go back to School.";
              }
              System.out.printf("%s\n" +
                      "Do you want to enter another score? (y/n).", output);
              cont = input.next().charAt(0);
          }
      }
}
