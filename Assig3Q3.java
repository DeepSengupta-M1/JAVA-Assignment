import java.util.*;

public class Assig3Q3 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0)
            System.out.println("\nIt is a Leap Year.");
        else if (year % 400 == 0)
            System.out.println("\nIt is a Leap Year.");
        else
            System.out.println("\nIt is not a Leap Year.");
    }
}