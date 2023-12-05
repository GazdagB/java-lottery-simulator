import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("$$$ Lottery Winning Simulator! $$$!");
        testInputs(userInput());
    }

    public static int[] userInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 5 numbers! (They must be between 1-90)");
        System.out.println("They must be separated with a space!");
        String input = in.nextLine();

        String[] strings = input.split(" ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        return numbers;
    }

    public static void testInputs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 1 || numbers[i] > 90) {
                throw new IllegalStateException("The numbers must be between 1-90");
            }

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    throw new IllegalStateException("You have to put in 5 different numbers! ");
                }
            }
        }
    }
}
