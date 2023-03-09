package hexlet.code;

import java.util.Scanner;

public class Engine {


    public static void startGame(String[] questions, String[] results) {
        Scanner scanner = new Scanner(System.in);
        String[] answers = new String[HelpfulUtils.getQuantityRounds()];

        for (int i = 0; i < HelpfulUtils.getQuantityRounds(); i++) {
            System.out.println(questions[i]);
            System.out.println("Your answer: ");
            answers[i] = scanner.nextLine();

            if (HelpfulUtils.checkAnswer(answers[i], results[i])) {
                System.out.println("Correct!");
            }
        }
        Greet.awesomePlayer();
    }

}
