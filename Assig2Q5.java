import java.util.*;

public class Assig2Q5 {
    public static void main(String[] args){
        int a, b, temp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
            a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
            b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

      System.out.println("a = " +a);
      System.out.println("b = " +b);
   }
}