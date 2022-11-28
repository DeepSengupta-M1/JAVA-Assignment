import java.util.Scanner;
public class Assig4Q11
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the person(in meters):");
        final double height = sc.nextDouble();
        System.out.print("Enter the weight of the person(in kgs):");
        final double weight = sc.nextDouble();
        final double BMI = weight / Math.pow(height, 2.0);
        System.out.println("BMI=" + BMI);
        if (BMI < 18.5) {
            System.out.println("The person is underweight.");
        }
        else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("The person has normal weight.");
        }
        else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("The person is overweight.");
        }
        else {
            System.out.println("The person is obese.");
        }
    }
}