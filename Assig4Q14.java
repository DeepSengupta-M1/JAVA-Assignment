import java.util.Random;
import java.util.Scanner;

public class Assig4Q14
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final Random r = new Random();
        System.out.print("Scissor(0),Rock(1),Paper(2):");
        final int input = sc.nextInt();
        final int random = r.nextInt(2);
        System.out.println("Computer picks: " + random);
        if (input == 0 && random == 1) {
            System.out.println("The computer is Rock. You are Scissor. Computer wins");
        }
        else if (input == 0 && random == 2) {
            System.out.println("The computer is Paper. You are Scissor. You win.");
        }
        else if (input == 0 && random == 0) {
            System.out.println("The computer is Scissor. You are Scissor too. It is a draw.");
        }
        else if (input == 1 && random == 0) {
            System.out.println("The computer is Scissor. You are Rock. You win.");
        }
        else if (input == 1 && random == 1) {
            System.out.println("The computer is Rock. You are Rock too. It is a tie.");
        }
        else if (input == 1 && random == 2) {
            System.out.println("The computer is Paper. You are Rock. Computer wins.");
        }
        else if (input == 2 && random == 0) {
            System.out.println("The computer is Scissor. You are Paper. Computer wins.");
        }
        else if (input == 2 && random == 1) {
            System.out.println("The computer is Rock. You are Paper. You win.");
        }
        else if (input == 2 && random == 2) {
            System.out.println("The computer is Paper. You are Paper too. It is a tie.");
        }
    }
}