import java.util.Scanner;
public class Assig4Q7
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x co-ordinate:");
        final double x = sc.nextDouble();
        System.out.print("Enter the y co-ordinate:");
        final double y = sc.nextDouble();
        if (x == 0.0 && y == 0.0) {
            System.out.println("(" + x + "," + y + ") is on the origin");
        }
        else if (x == 0.0) {
            System.out.println("(" + x + "," + y + ") is on the y-axis");
        }
        else if (y == 0.0) {
            System.out.println("(" + x + "," + y + ") is on the x-axis");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("(" + x + "," + y + ") is in quadrant I");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("(" + x + "," + y + ") is in quadrant II");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("(" + x + "," + y + ") is in quadrant III");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("(" + x + "," + y + ") is in quadrant IV");
        }
    }
}