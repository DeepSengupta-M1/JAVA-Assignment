import java.util.Scanner;
public class Assig4Q2
{
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        n = s.nextInt();
        if(n >= 40)
        {
            System.out.println("Congratulation! You have passed the exam.");
        }
        else
        {
            System.out.println("Sorry! You have failed the exam.");
        }
    }
}