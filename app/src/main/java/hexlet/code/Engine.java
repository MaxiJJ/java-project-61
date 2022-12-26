package hexlet.code;

public class Engine {

    private static final int COUNT_FOR_WIN = 3;
    private static final int COUNT_CORRECT_ANSWER = 0;

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
