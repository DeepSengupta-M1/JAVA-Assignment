import java.util.Scanner;
public class Assig4Q1
{
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height: ");
        n = s.nextInt();
        if(n >= 6)
        {
            System.out.println("The person is tall.");
        }
        else
        {
            System.out.println("The person is short.");
        }
    }
}