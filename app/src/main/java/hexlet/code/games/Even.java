package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.HelpfulUtils;

public class Even {

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.getQuantityRounds()][Engine.getOneQuestionOneAnswer()];

        for (int i = 0; i < Engine.getQuantityRounds(); i++) {
            int random = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            questionsAndAnswers[i][0] = "Question: " + random;
            questionsAndAnswers[i][1] = random % 2 == 0 ? "yes" : "no";
        }
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startGame(questionsAndAnswers, description);
    }
}
