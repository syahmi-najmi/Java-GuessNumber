import java.util.Scanner;

public class GFG {

    // functon that implements the number guessing game
    public static void guessingNumberGame() {
        // Scaner class
        Scanner sc = new Scanner(System.in);

        // generate the numbers
        int number = 1 + (int) (100 * Math.random());

        // Given K trials
        int K = 5;

        int i, guess;

        System.out.println(
                "A number is chosen" + " between 1 to 100. "
                        + " Guess the numher" + " within 5 trials");

        // iterate over K trials
        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");

            // take input for guessing
            guess = sc.nextInt();

            // if the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + "Yoi guess the number");

                break;
            } else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            } else if (number < guess && i != K - 1) {
                System.out.println("The number is " + "less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You exhausted" + "K trials.");

            System.out.println("The number was " + number);
        }
    }

    // Driver code
    public static void main(String arg[]) {

        // function call
        guessingNumberGame();
    }
}