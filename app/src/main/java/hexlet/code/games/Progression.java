package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import hexlet.code.HelpfulUtils;

import java.util.Arrays;
import java.util.Random;

public class Progression {

    private static final int ARRAY = 10;

    public static int[] getSequence() {
        int diff = getRandomInt(ARRAY);
        if (diff == 0) {
            diff = diff + 1;
        }

        int[] sequence = new int[ARRAY];
        sequence[0] = HelpfulUtils.getRandomInt();
        char operation = HelpfulUtils.getRandomOperation("+-*");
        for (int i = 0; i < sequence.length; i++) {
            if (operation == '-') {
                sequence[i] = sequence[i - 1] - diff;
            } else if (operation == '+') {
                sequence[i] = sequence[i - 1] + diff;
            }
        }
        return sequence;
    }

    public static int getRandomInt(int limit) {
        Random randomInt = new Random();
        return randomInt.nextInt(limit);
    }

    public static String sequenceWithX(int[] sequence, int x) {
        String toReplace = " " + sequence[x] + " ";
        String numbers = Arrays.toString(sequence);
        numbers = numbers.replace(",", "")
                .replace("[", " ")
                .replace("]", " ")
                .replace(toReplace, " .. ");
        return ("Question" + numbers);
    }

    public static void startGame() {
        Greet.greeting();
        System.out.println("What number is missing in the progression?");
        String[] questions = new String[HelpfulUtils.getQuantityRounds()];
        String[] answers = new String[HelpfulUtils.getQuantityRounds()];

        for (int i = 0; i < HelpfulUtils.getQuantityRounds(); i++) {
            int[] seq = getSequence();
            int x = Math.abs(getRandomInt(seq.length - 1));
            questions[i] = sequenceWithX(seq, x);
            answers[i] = Integer.toString(seq[x]);
        }
        Engine.startGame(questions, answers);
    }

}
