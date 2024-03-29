package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int QUANTITY_ROUNDS = 3;

    public static final int ONE_QUESTION_ONE_ANSWER = 2;

    public static int startGame(String[][] questionsAndAnswers, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(description);
        scanner = new Scanner(System.in);
        String[] answers = new String[QUANTITY_ROUNDS];

        for (int i = 0; i < QUANTITY_ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.println("Your answer: ");
            answers[i] = scanner.nextLine();

            if (questionsAndAnswers[i][1].equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answers[i] + "' is wrong answer ;(. "
                        + "Correct answer was '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + username + "!");
                return 0;
            }
        }
        System.out.println("Congratulations, " + username + "!");
        return 0;
    }
}
