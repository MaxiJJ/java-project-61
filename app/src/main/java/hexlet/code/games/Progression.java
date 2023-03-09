package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.HelpfulUtils;

public class Progression {

    private static final int ELEMENTS_IN_PROGRESSION = 10;

    public static String[] getSequence(int startingNumber, int diff, char operation, int length) {
        String[] strSequence = new String[length];
        int[] sequence = new int[length];
        sequence[0] = startingNumber;
        for (int i = 1; i < sequence.length; i++) {
            if (operation == '-') {
                sequence[i] = sequence[i - 1] - diff;
            } else if (operation == '+') {
                sequence[i] = sequence[i - 1] + diff;
            }
        }
        for (int j = 0; j < strSequence.length; j++) {
            strSequence[j] = String.valueOf(sequence[j]);
        }
        return strSequence;
    }

    public static String seqWithHiddenElement(String[] sequence, int hiddenElement) {
        sequence[hiddenElement] = "..";
        String numberWithHiddenElement = String.join(" ", sequence);
        return numberWithHiddenElement;
    }

    public static void startGame() {
        String[][] questionsAndAnswers = new String[Engine.getQuantityRounds()][Engine.getOneQuestionOneAnswer()];

        for (int i = 0; i < Engine.getQuantityRounds(); i++) {
            int diff = HelpfulUtils.getRandomInt(ELEMENTS_IN_PROGRESSION);
            diff = (diff == 0) ? diff : (diff + 1);
            int numberOfStarting = HelpfulUtils.getRandomInt(HelpfulUtils.getDefaultMax());
            char operation = HelpfulUtils.getRandomOperation("+-*");
            String[] sequence = getSequence(numberOfStarting, diff, operation, ELEMENTS_IN_PROGRESSION);
            int hiddenElement = Math.abs(HelpfulUtils.getRandomInt(sequence.length - 1));
            questionsAndAnswers[i][1] = sequence[hiddenElement];
            questionsAndAnswers[i][0] = seqWithHiddenElement(sequence, hiddenElement);
        }
        String description = "What number is missing in the progression?";
        Engine.startGame(questionsAndAnswers, description);
    }

}
