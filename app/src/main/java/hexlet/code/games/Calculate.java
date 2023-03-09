package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
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
        Greet.greeting();
        System.out.println("What is the result of the expression?");
        String[] questions = new String[HelpfulUtils.getQuantityRounds()];
        String[] answers = new String[HelpfulUtils.getQuantityRounds()];

        for (int i = 0; i < HelpfulUtils.getQuantityRounds(); i++) {
            int number1 = HelpfulUtils.getRandomInt();
            int number2 = HelpfulUtils.getRandomInt();
            char operation = HelpfulUtils.getRandomOperation("+-*");
            questions[i] = "Question: " + number1 + " " + operation + " " + number2;
            answers[i] = calc(number1, number2, operation);
        }
        Engine.startGame(questions, answers);
    }

}
