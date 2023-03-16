package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.HelpfulUtils;

public class Calculate {

    public static String calc(int number1, int number2, char operation) {
        int result = 0;

        if (operation == '+') {
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '*') {
            result = number1 * number2;
        }
        return Integer.toString(result);
    }

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.QUANTITY_ROUNDS][Engine.ONE_QUESTION_ONE_ANSWER];

        for (int i = 0; i < Engine.QUANTITY_ROUNDS; i++) {
            int number1 = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            int number2 = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            char operation = HelpfulUtils.getRandomOperation("+-*");
            questionsAndAnswers[i][0] = number1 + " " + operation + " " + number2;
            questionsAndAnswers[i][1] = calc(number1, number2, operation);
        }
        String description = "What is the result of the expression?";
        Engine.startGame(questionsAndAnswers, description);
    }

}
