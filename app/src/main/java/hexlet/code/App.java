package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calculate;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isWrongAnswer;
        String greet = "Welcome to the Brain Games!";

        final int caseCalc = 3;
        final int caseGCD = 4;
        final int caseProgression = 5;
        final int casePrime = 6;

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
                case caseCalc:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Calculate.calculate();
                    break;
                case caseGCD:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    GCD.gcd();
                    break;
                case caseProgression:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Progression.progression();
                    break;
                case casePrime:
                    System.out.println(greet);
                    Cli.welcomeGamer();
                    Prime.prime();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("choose from 0 to 6");
                    isWrongAnswer = true;
            }
        } while (isWrongAnswer);
    }
}
