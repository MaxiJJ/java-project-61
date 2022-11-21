package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isWrongAnswer;
        String greet = "Welcome to the Brain Games!";

        do {
            isWrongAnswer = false;
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - Exit");
            System.out.println("3 - Calc");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println(greet);
                    Cli.welcomeGamer();

                case 2:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Games.even();

                case 3:
                    System.out.println(greet);
                    Cli.welcomeGamer();;
                    Games.calculate();
                case 0:
                    break;

                default:
                    System.out.println("choose from 0 to 3");
                    isWrongAnswer = true;
            }
        } while (isWrongAnswer);
    }
}
