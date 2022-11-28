import java.util.Scanner;
public class Assig4Q6
{
    public static void main(final String[] args) {
        System.out.println("The equations are:-\nax+by=e\nbx+cy=f");
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        final double a = sc.nextDouble();
        System.out.print("Enter the value of b:");
        final double b = sc.nextDouble();
        System.out.print("Enter the value of c:");
        final double c = sc.nextDouble();
        System.out.print("Enter the value of d:");
        final double d = sc.nextDouble();
        System.out.print("Enter the value of e:");
        final double e = sc.nextDouble();
        System.out.print("Enter the value of f:");
        final double f = sc.nextDouble();
        if (a * d - b * c == 0.0) {
            System.out.println("The equation has no solution.");
        }
        else {
            final double x = (e * d - b * f) / (a * d - b * c);
            final double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x=" + x + "  ,  y=" + y);
        }
    }
}