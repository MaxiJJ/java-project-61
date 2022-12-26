package hexlet.code;

import hexlet.code.games.*;

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
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    break;
                case 2:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Even.even();
                    break;
                case 3:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Calculate.calculate();
                    break;
                case 4:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    GCD.gcd();
                    break;
                case 5:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Progression.progression();
                    break;
                case 6:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Prime.prime();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("choose from 0 to 4");
                    isWrongAnswer = true;
            }
        } while (isWrongAnswer);
    }
}
