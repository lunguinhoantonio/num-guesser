import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String negativeMsg;
        String tipMsg;

        double num = Math.random();
        int randomNum = (int) (1 + num * (5 - 1));
        int attempts = 2;
        int userAttempt;
        String guessNumOption = "Guess a number between 1 and 5: ";
        String div = "----------------------------------";

        do {
            System.out.println(div);
            System.out.println("Attempts: " + attempts);
            System.out.print(guessNumOption);
            userAttempt = scan.nextInt();
            if (userAttempt == randomNum) {
                System.out.println(div);
                System.out.print("You win!");
                System.exit(0);
            } else if (userAttempt < 0 || userAttempt > 5) {
                System.out.println(div);
                System.out.println("Type a valid number!");
                System.out.println("Attempts: " + attempts);
                System.out.print(guessNumOption);
                userAttempt = scan.nextInt();
                if (userAttempt == randomNum) {
                    System.out.println(div);
                    System.out.print("You win!");
                    System.exit(0);
                } else {
                    --attempts;
                    System.out.println(div);
                    negativeMsg = (attempts != 0) ? "Try again!" : "You lose! \n" +
                            "The correct number was " + randomNum;

                    tipMsg = (userAttempt < randomNum && attempts != 0) ?
                            "Tip: The number is bigger" :
                            "Tip: The number is smaller";

                    if (attempts == 0) { // Verify if attempts is equals to 0, don't send any message from tipMsg
                        tipMsg = "";
                    }

                    System.out.println(negativeMsg);
                    System.out.println(tipMsg);
                    System.out.println(div);
                }
            } else {
                --attempts;
                System.out.println(div);
                negativeMsg = (attempts != 0) ? "Try again!" : "You lose! \n" +
                        "The correct number was " + randomNum;

                tipMsg = (userAttempt < randomNum && attempts != 0) ?
                        "Tip: The number is bigger" :
                        "Tip: The number is smaller";

                if (attempts == 0) { // Verify if attempts is equals to 0, don't send any message from tipMsg
                    tipMsg = "";
                }

                System.out.println(negativeMsg);
                System.out.println(tipMsg);
            }
        }
        while (attempts > 0);
    }
}
