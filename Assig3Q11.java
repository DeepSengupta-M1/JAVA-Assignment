import java.util.*;

public class Assig3Q11 {
    public static void main(String args[]) {
        String name;
        int age, regdno;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your Regd. No.: ");
        regdno = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + regdno);
    }
}