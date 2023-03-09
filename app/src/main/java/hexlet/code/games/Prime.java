package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
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
        Greet.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] questions = new String[HelpfulUtils.getQuantityRounds()];
        String[] answers = new String[HelpfulUtils.getQuantityRounds()];

        for (int i = 0; i < HelpfulUtils.getQuantityRounds(); i++) {
            int random = HelpfulUtils.getRandomInt();
            questions[i] = "Question: " + random;
            answers[i] = isPrime(random) ? "yes" : "no";
        }
        Engine.startGame(questions, answers);
    }
}
