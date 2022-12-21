package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void progression() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        int correctAnswer;

        for (int i = 0; i < Engine.getCountForWin(); i++) {

            int firstNumberOfProgression = (int) (Math.random() * 10);
            int stepProgression = (int) (1 + Math.random() * 10);
            int amountElementsOfProgression = (int) (5 + Math.random() * 5);

            int[] arrayProgression = new int[amountElementsOfProgression];

            arrayProgression[0] = firstNumberOfProgression;

            String[] array = new String[arrayProgression.length];

            for (int j = 1; j < arrayProgression.length; j++) {
                firstNumberOfProgression = firstNumberOfProgression + stepProgression;
                arrayProgression[j] = firstNumberOfProgression;
            }

            for (int j = 0; j < array.length; j++) {
                array[j] = String.valueOf(arrayProgression[j]);
            }

            int random = (int) (array.length * Math.random());
            String hiddenElement = array[random];

            array[random] = hiddenElement.replace(hiddenElement, "..");

            System.out.println("Question: " + Arrays.toString(array));

            String sc = scanner.nextLine();

            System.out.println("Your answer: " + sc);

            if (hiddenElement.equals(sc)) {
                System.out.println("Correct!");
                correctAnswer = Engine.getCountCorrectAnswer() + 1;
            } else {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was " + "'" + hiddenElement + "'");
                break;
            }

            if (Engine.getCountForWin() == correctAnswer) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
                break;
            }
        }
        Engine.endGame();

    }
}