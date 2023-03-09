package hexlet.code;

import java.util.Scanner;

public class Greet {
    private static String username;

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        username = scanner.nextLine();
        System.out.println("Hello, " + username + "!");
    }

    public static void awesomePlayer() {
        System.out.println("Congratulations, " + username + "!");
    }

    public static void tryAgain() {
        System.out.println("Let's try again, " + username + "!");
    }
}
