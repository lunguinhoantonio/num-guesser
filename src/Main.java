import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String negativeMsg;
        double num = Math.random();
        int randomNum = (int) (1 + num * (5 - 1));
        int attempts = 2;
        int userAttempt;

        do {
            System.out.println("Attempts: " + attempts);
            System.out.print("Guess a number between 1 and 5: ");
            userAttempt = scan.nextInt();
            if (userAttempt == randomNum) {
                System.out.print("You win!");
                System.exit(0);
            } else {
                --attempts;
                System.out.println("--------------------------------");
                negativeMsg = (attempts != 0) ? "Try again!" : "You lose! \nThe correct number was " + randomNum;
                System.out.println(negativeMsg);
            }
        }
        while (attempts > 0);
    }
}