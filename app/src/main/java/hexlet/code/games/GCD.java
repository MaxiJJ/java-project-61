package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void gcd() {

        int correctAnswer = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Engine.getCountForWin(); i++) {

            int a = (int) (1 + Math.random() * Engine.RANGE_OF_RANDOM_GCD);
            int b = (int) (1 + Math.random() * Engine.RANGE_OF_RANDOM_GCD);

            System.out.println("Question: " + a + " " + b);
            int sc = scanner.nextInt();

            if (gcdByEuclidsAlgorithm(a, b) == sc) {
                System.out.println("Your answer: " + sc);
                System.out.println("Correct!");
                correctAnswer++;
            } else {
                System.out.println("Your answer: " + sc);
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + (gcdByEuclidsAlgorithm(a, b)) + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
        }

        if (Engine.getCountForWin() == correctAnswer) {
            Engine.endGame();
        }
    }

    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
