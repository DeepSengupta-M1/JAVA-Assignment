import java.util.Scanner;

public class Assig4Q18
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender;
        String firstName;
        String lastName;
        int age;
        String answer;

        System.out.print("Hello! What gender are you?(m/f) ");
        gender = scanner.next();
        System.out.print("What's your first name? ");
        firstName = scanner.next();
        System.out.print("What's your last name? ");
        lastName = scanner.next();

        if (gender.equals("m")) {
            System.out.print("How old are you? ");
            age = scanner.nextInt();
            if (age < 20) {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            } else if (age >= 20) {
                System.out.println("Then I shall call you Mr. " + firstName);
            }
        } else if (gender.equals("f")) {
            System.out.print("How old are you? ");
            age = scanner.nextInt();
            if (age >= 20) {
                System.out.println("Are you married?(y/n) ");
                answer = scanner.next();
                if (answer.equals("y")) {
                    System.out.println("Then I shall call you Mrs. " + firstName);

                } else if (answer.equals("n")) {
                    System.out.println("Then I shall call you Ms. " + firstName);
                }
            } else if (age < 20) {
                System.out.println("Then I shall call you " + firstName + " " + lastName);
            }
        }
    }
}