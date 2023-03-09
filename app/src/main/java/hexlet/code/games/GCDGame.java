package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import hexlet.code.HelpfulUtils;

public class GCDGame {

    public static int getNod(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getNod(number2, number1 % number2);
    }

    public static void startGame() {
        Greet.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        String[] questions = new String[HelpfulUtils.getQuantityRounds()];
        String[] answers = new String[HelpfulUtils.getQuantityRounds()];

        for (int i = 0; i < HelpfulUtils.getQuantityRounds(); i++) {
            int number1 = HelpfulUtils.getRandomInt();
            int number2 = HelpfulUtils.getRandomInt();
            questions[i] = "Question: " + number1 + " " + number2;
            answers[i] = Integer.toString(getNod(number1, number2));
        }
        Engine.startGame(questions, answers);
    }
}
