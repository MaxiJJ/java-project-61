package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    public static void prime() {

        Scanner scanner = new Scanner(System.in);
        int correctAnswer = 0;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < Engine.getCountForWin(); i++) {
            int prime = (int) (2 + Math.random() * Engine.RANGE_OF_RANDOM_PRIME);
            BigInteger bg = BigInteger.valueOf(prime);
            boolean probablePrime = bg.isProbablePrime((int) Math.log(prime));

            System.out.println("Question: " + prime);
            String sc = scanner.nextLine();
            System.out.println("Your answer: " + sc);

            if (sc.equals("yes") && probablePrime) {
                System.out.println("Correct!");
                correctAnswer++;
            } else if (sc.equals("no") && !probablePrime) {
                System.out.println("Correct!");
                correctAnswer++;
            } else if (sc.equals("yes") && !probablePrime) {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'" + "no" + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            } else if (sc.equals("no") && probablePrime) {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'" + "yes" + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (Engine.getCountForWin() == correctAnswer) {
            Engine.endGame();
        }
    }
}
