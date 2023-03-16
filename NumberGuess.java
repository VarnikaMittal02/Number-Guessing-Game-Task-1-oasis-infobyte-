import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String args[]) {
        Random sc = new Random();
        int Numbertoguess = sc.nextInt(100) + 1;
        Scanner scn = new Scanner(System.in);
        int guess;
        do {
            System.out.println("GUESS NUMBER BETWEEM 1 TO 100");
            guess = scn.nextInt();
            if (guess < Numbertoguess) {
                System.out.println(" To Low !! Guess Again  ");
            } else if (guess > Numbertoguess) {
                System.out.println(" To High !! Guess Again  ");
            } else {
                System.out.println("Congratulation!! You guess right number");
            }
        }

        while (guess != Numbertoguess);

    }
}
