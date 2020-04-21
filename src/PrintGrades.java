/*
Pseudocode:
import scanner
declare method
declare vars for scanner, exam scores, grade
prompt user to enter a score
define if statements
convert exam score to string with + or -

 */
import java.util.Scanner;

public class PrintGrades {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int score;
          char cont = 'y';
          String output = "Good job. Your grade is ";
          System.out.println("Enter an exam score: ");
          score = input.nextInt();

          while (cont == 'y') {
              if (score <= 100 && score >= 90) {
                  output.concat("A.");
              } else if (score <= 89 && score >= 80) {
                  output.concat("B.");
              } else if (score <= 79 && score >= 70) {
                  output.concat("C.");
              } else if (score <= 69 && score >= 60) {
                  output.concat("D.");
              } else if (score <= 59) {
                  output = "Go back to School.";
              }
              System.out.printf("%s.\n" +
                      "Do you want to enter another score? (y/n).", output);
              cont = input.next().charAt(0);
          }
      }
}
