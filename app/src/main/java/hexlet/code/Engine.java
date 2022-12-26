package hexlet.code;

public class Engine {

    private static final int COUNT_FOR_WIN = 3;
    private static final int COUNT_CORRECT_ANSWER = 0;

    public static final int RANGE_OF_RANDOM_CALC = 20;

    public static final int RANGE_OF_RANDOM_EVEN_AND_PROGRESSION = 10;

    public static final int RANGE_OF_RANDOM_PROGRESSION = 5;

    public static final int RANGE_OF_RANDOM_GCD = 100;

    public static final int RANGE_OF_RANDOM_PRIME = 50;
    public static void endGame() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static int getCountForWin() {
        return COUNT_FOR_WIN;
    }

    public static int getCountCorrectAnswer() {
        return COUNT_CORRECT_ANSWER;
    }

}
