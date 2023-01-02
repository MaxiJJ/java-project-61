package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final String POSITIVE_ANSWER = "yes";
    private static final String NEGATIVE_ANSWER = "no";



    public static void even() {
        int countCorrectAnswer = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(RULES);

        for (int i = 0; i < Engine.getCountForWin(); i++) {

            int question = (int) (Math.random() * Engine.RANGE_OF_RANDOM_EVEN_AND_PROGRESSION);

            System.out.println("Question: " + question);

            String sc = scanner.nextLine();

            if (isEven(question) && sc.equals(POSITIVE_ANSWER)) {
                System.out.println("Your answer: yes");
                System.out.println("Correct!");
                countCorrectAnswer++;
            } else if (!isEven(question) && sc.equals(NEGATIVE_ANSWER)) {
                System.out.println("Your answer: no");
                System.out.println("Correct!");
                countCorrectAnswer++;
            } else if (isEven(question) && !sc.equals(POSITIVE_ANSWER)) {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + POSITIVE_ANSWER + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            } else if (!isEven(question) && !sc.equals(NEGATIVE_ANSWER)) {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + NEGATIVE_ANSWER + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
        }

        if (Engine.getCountForWin() == countCorrectAnswer) {
            Engine.endGame();
        }
    }

    public static boolean isEven(int question) {
        return question % 2 == 0;
    }
}
