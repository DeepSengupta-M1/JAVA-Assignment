import java.util.Scanner;
public class Assig4Q5
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic equation is : ax^2 + bx + c");
        System.out.print("Enter value of a:");
        final double a = sc.nextDouble();
        System.out.print("Enter value of b:");
        final double b = sc.nextDouble();
        System.out.print("Enter value of c:");
        final double c = sc.nextDouble();
        final double D = Math.pow(b, 2.0) - 4.0 * a * c;
        System.out.println("The value of the determinant=" + D);
        if (D > 0.0) {
            System.out.println("The equation has two real roots:-");
            final double R1 = (-b + Math.pow(D, 0.5)) / (2.0 * a);
            final double R2 = (-b - Math.pow(D, 0.5)) / (2.0 * a);
            System.out.println("Root 1 : " + R1);
            System.out.println("Root 2 : " + R2);
        }
        else if (D == 0.0) {
            final double R3 = -b / (2.0 * a);
            System.out.println("The equation has only one real root:" + R3);
        }
        else {
            System.out.println("The equation has no real roots.");
        }
    }
}