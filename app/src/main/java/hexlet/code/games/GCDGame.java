package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.HelpfulUtils;

public class GCDGame {

    public static int getNod(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getNod(number2, number1 % number2);
    }

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.QUANTITY_ROUNDS][Engine.ONE_QUESTION_ONE_ANSWER];

        for (int i = 0; i < Engine.QUANTITY_ROUNDS; i++) {
            int number1 = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            int number2 = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            questionsAndAnswers[i][0] = "Question: " + number1 + " " + number2;
            questionsAndAnswers[i][1] = Integer.toString(getNod(number1, number2));
        }
        String description = "Find the greatest common divisor of given numbers.";
        Engine.startGame(questionsAndAnswers, description);
    }
}
