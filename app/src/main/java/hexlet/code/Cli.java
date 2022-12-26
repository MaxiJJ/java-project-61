package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;

    public static void welcomeGamer() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
