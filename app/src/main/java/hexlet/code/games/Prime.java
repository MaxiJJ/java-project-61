package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.HelpfulUtils;

public class Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.QUANTITY_ROUNDS][Engine.ONE_QUESTION_ONE_ANSWER];

        for (int i = 0; i < Engine.QUANTITY_ROUNDS; i++) {
            int random = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            questionsAndAnswers[i][0] = "" + random;
            questionsAndAnswers[i][1] = isPrime(random) ? "yes" : "no";
        }
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startGame(questionsAndAnswers, description);
    }
}
