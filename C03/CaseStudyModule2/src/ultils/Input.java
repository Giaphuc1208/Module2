package ultils;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.err.println("Please enter a number");
        }
        return getInt();
    }

    public static double getDou() {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.err.println("Please enter a number");
        }
        return getDou();
    }

    public static String getString() {
        return scanner.nextLine();
    }

}
