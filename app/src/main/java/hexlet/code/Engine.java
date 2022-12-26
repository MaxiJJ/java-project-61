package hexlet.code;

public class Engine {

    private static final int countForWin = 3;
    private static final int countCorrectAnswer = 0;

    public static void endGame() {
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static int getCountForWin() {
        return countForWin;
    }

    public static int getCountCorrectAnswer() {
        return countCorrectAnswer;
    }
}
