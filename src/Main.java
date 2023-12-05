import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("$$$ Lottery Winning Simulator! $$$!");
        userInput();
    }

    public static void userInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 5 numbers! (They must be between 1-90)");
        System.out.println("They must be separated with a space!");
        String input = in.nextLine();

        String[] strings = input.split(" ");
        System.out.println(Arrays.toString(strings));
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(strings[i]);
        }

    }

}