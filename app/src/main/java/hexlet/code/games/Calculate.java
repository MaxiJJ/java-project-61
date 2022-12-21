package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calculate {

    static Random randomGenerator = new Random();
    static String operators = "+-*";

    public static void calculate() {

        Scanner scanner = new Scanner(System.in);

        int correctAnswer = 0;


        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.getCountForWin(); i++) {
            int a = (int) (Math.random() * 20);
            int b = (int) (Math.random() * 20);
            String operation = String.valueOf(Calculate.getRandomGenerator());

            System.out.println("Question: " + a + " " + operation + " " + b);
            int sc = scanner.nextInt();

            if (a + b == sc || a - b == sc || a * b == sc) {
                System.out.println("Your answer: " + sc);
                System.out.println("Correct!");
                correctAnswer++;
            } else if (operation.equals("+") && a + b != sc) {
                System.out.println("Your answer: " + sc);
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'" + (a + b) + "'");
                break;
            } else if (operation.equals("-") && a - b != sc) {
                System.out.println("Your answer: " + sc);
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'" + (a - b) + "'");
                break;
            } else if (operation.equals("*") && a * b != sc) {
                System.out.println("Your answer: " + sc);
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'" + (a * b) + "'");
                break;
            }
        }

        if (Engine.getCountForWin() == correctAnswer) {
            Engine.endGame();
        }
    }

    public static char getRandomGenerator() {
        return operators.charAt(randomGenerator.nextInt(operators.length()));
    }
}
