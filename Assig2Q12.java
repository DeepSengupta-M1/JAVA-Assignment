import java.util.*;

public class Assig2Q12 {
    public static void main(String[] args){
        int a, b, c, smallest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("Enter the third number: ");
        c = sc.nextInt();

        if(a<b)
        {
            if(c<a)
            {
                smallest = c;
            }
            else
            {
                smallest = a;
            }
        }
        else
        {
            if(b<c)
            {
                smallest = b;
            }
            else
            {
                smallest = c;
            }
        }
        System.out.println(smallest+ " is the smallest number.");
    }
}