package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.HelpfulUtils;

public class Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if ((num % 2) == 0) {
                return false;
            }
        }
        return false;
    }

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.getQuantityRounds()][Engine.getOneQuestionOneAnswer()];

        for (int i = 0; i < Engine.getQuantityRounds(); i++) {
            int random = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            questionsAndAnswers[i][0] = "Question: " + random;
            questionsAndAnswers[i][1] = isPrime(random) ? "yes" : "no";
        }
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startGame(questionsAndAnswers, description);
    }
}
