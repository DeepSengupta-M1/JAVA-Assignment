import java.util.*;

public class Assig2Q9 {
    public static void main(String[] args){
        int num; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if (num<100)
            System.out.println("Number is less than 100");
        else 
        {
            if (num>100)
            System.out.println("Number is greater than 100");
        }
    }
}
