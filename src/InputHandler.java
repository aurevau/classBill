import java.util.Scanner;

public class InputHandler {

    public static Scanner input = new Scanner(System.in);

    public static String getString() {
        return input.nextLine();
    }

    public static int getInt() {

        while (!input.hasNextInt()) {
            System.out.println("Error: Invalid input! Try again with an integer");
            input.nextLine();
        }
        int result = input.nextInt();
        input.nextLine();
        return result;

    }


    public static int getInt(int min, int max) {


        while (true) {
            int input = getInt();

            if (input >= min && input <= max) {
                return input;
            }

            System.out.println("Error: Invalid input! Try again with a number between " + min + " - " + max);


        }
    }
}
