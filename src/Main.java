import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String negativeMsg;
        double num = Math.random();
        int randomNum = (int) (1 + num * (5 - 1));
        int chances = 2;
        int chute;

        do {
            System.out.println("Chances: " + chances);
            System.out.print("Adivinhe o valor entre 1 e 5: ");
            chute = scan.nextInt();
            if (chute == randomNum) {
                System.out.print("Você acertou!");
                System.exit(0);
            } else {
                --chances;
                System.out.println("--------------------------------");
                negativeMsg = (chances != 0) ? "Tente novamente!" : "Você perdeu!";
                System.out.println(negativeMsg);
            }
        }
        while (chances > 0);
    }
}