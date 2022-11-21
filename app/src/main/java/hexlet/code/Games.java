package hexlet.code;

import hexlet.code.Cli;

import java.util.Arrays;
import java.util.Scanner;

public class Games {

    public static void calculate() {

    }

    public static void even() {
        int countForWin = 3;
        int countCorrectAnswer = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < countForWin; i++) {

            int question = (int) (Math.random() * 10);

            System.out.println("Question: " + question);

            String sc = scanner.nextLine();

            if (question % 2 == 0 && sc.equals("yes")) {
                System.out.println("Your answer: yes");
                System.out.println("Correct!");
                countCorrectAnswer++;
            } else if (question % 2 != 0 && sc.equals("no")) {
                System.out.println("Your answer: no");
                System.out.println("Correct!");
                countCorrectAnswer++;
            } else if (question % 2 == 0 && !sc.equals("yes")) {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'yes'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            } else if (question % 2 != 0 && !sc.equals("no")) {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'yes'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }

            if(countForWin == countCorrectAnswer) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
                break;
            }
        }
    }
}
