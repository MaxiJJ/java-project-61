package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import hexlet.code.HelpfulUtils;

public class Even {

    public static void startGame() {
        Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[] questions = new String[HelpfulUtils.getQuantityRounds()];
        String[] answers = new String[HelpfulUtils.getQuantityRounds()];

        for (int i = 0; i < HelpfulUtils.getQuantityRounds(); i++) {
            int random = HelpfulUtils.getRandomInt();
            questions[i] = "Question: " + random;
            answers[i] = random % 2 == 0 ? "yes" : "no";
        }
        Engine.startGame(questions, answers);
    }
}
