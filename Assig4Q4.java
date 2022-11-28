import java.util.Scanner;
public class Assig4Q4
{
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter your character:");
        final char ch = sc.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(String.valueOf(ch) + " is a capital letter.");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(String.valueOf(ch) + " is a small letter.");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println(String.valueOf(ch) + " is a number.");
        }
        else if ((ch >= '\0' && ch <= '/') || (ch >= ':' && ch <= '@') || (ch >= '[' && ch <= '`') || (ch >= '{' && ch <= '\u007f')) {
            System.out.println(String.valueOf(ch) + " is a special character.");
        }
    }
}