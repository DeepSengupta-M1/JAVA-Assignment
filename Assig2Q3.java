import java.util.*;

public class Assig2Q3 {
    public static void main(String[] args){
        int num, i, fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        for(i=num; i>=1; i--)
        {
            fact = fact*i;
        }
        System.out.println("\n Factorial Result = " +fact);
    }
}