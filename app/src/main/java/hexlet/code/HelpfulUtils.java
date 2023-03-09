package hexlet.code;

import java.util.Random;

public class HelpfulUtils {

    private static final int DEFAULT = 100;

    private static final int QUANTITY_ROUNDS = 3;

    public static int getQuantityRounds() {
        return QUANTITY_ROUNDS;
    }

    public static int getRandomInt() {
        Random randomInt = new Random();
        return randomInt.nextInt(DEFAULT);
    }

    public static char getRandomOperation(String s) {
        Random randomChar = new Random();
        int randomOperation = randomChar.nextInt(s.length());
        return s.charAt(randomOperation);
    }

    public static boolean checkAnswer(String answer, String result) {
        if (result.equals(answer)) {
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            fail();
            return false;
        }
    }

    public static void fail() {
        Greet.tryAgain();
        System.exit(0);
    }
}
