import java.util.Scanner;
public class Assig4Q12
{
    public static void main(final String[] args) {
        final int lar = -9999;
        final int[] ar = new int[5];
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers:");
        for (int i = 0; i < 3; ++i) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < 2; ++i) {
            if (ar[i] > ar[i + 1]) {
                final int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
        }
        System.out.println("The integers in non-decreasing order are:");
        for (int i = 0; i < 3; ++i) {
            System.out.print(String.valueOf(ar[i]) + " ");
        }
    }
}