import java.util.*;

public class Assig2Q10 {
    public static void main(String[] args){
        int num; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if (num>100 && num<50)
            System.out.println("Number is greater than 100 but less than 50");
        else if (num<100 && num>50)
            System.out.println("Number is less than 100 but greater than 50");
        else if (num<100 && num<50)
            System.out.println("Number is less than 100 and less than 50");
        else
            System.out.println("Number is greater than 100 and greater than 50");
    }
}
