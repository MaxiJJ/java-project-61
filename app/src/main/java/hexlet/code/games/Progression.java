package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import javax.xml.stream.events.EndDocument;
import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void progression() {

        Scanner scanner = new Scanner(System.in);
        int correctAnswer = 0;

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Engine.getCountForWin(); i++) {

            int firstNumberOfProgression = (int) (Math.random() * Engine.RANGE_OF_RANDOM_EVEN_AND_PROGRESSION);
            int stepProgression = (int) (1 + Math.random() * Engine.RANGE_OF_RANDOM_EVEN_AND_PROGRESSION);
            int amountElementsOfProgression = (int) (Engine.RANGE_OF_RANDOM_PROGRESSION
                    + Math.random() * Engine.RANGE_OF_RANDOM_PROGRESSION);

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

            System.out.println("Question: " + Arrays.toString(array).replace("[", "")
                    .replace("]", "").replaceAll(",", ""));

            String sc = scanner.nextLine();

            System.out.println("Your answer: " + sc);

            if (hiddenElement.equals(sc)) {
                System.out.println("Correct!");
                correctAnswer++;
            } else {
                System.out.println("'" + sc + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + hiddenElement + "'");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (Engine.getCountForWin() == correctAnswer) {
            Engine.endGame();
        }
    }
}
