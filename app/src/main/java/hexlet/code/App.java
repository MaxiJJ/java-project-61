package hexlet.code;

import hexlet.code.games.GCDGame;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import hexlet.code.games.Calculate;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isWrongAnswer;

        do {
            isWrongAnswer = false;
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            switch (sc.nextInt()) {
                case GREET:
                    Cli.greeting();
                    break;
                case EVEN:
                    Even.startGame();
                    break;
                case CALC:
                    Calculate.startGame();
                    break;
                case GCD:
                    GCDGame.startGame();
                    break;
                case PROGRESSION:
                    Progression.startGame();
                    break;
                case PRIME:
                    Prime.startGame();
                    break;
                case EXIT:
                    break;

                default:
                    System.out.println("choose from 0 to 6");
                    isWrongAnswer = true;
            }
        } while (isWrongAnswer);
    }
}
