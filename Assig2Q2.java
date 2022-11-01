import java.util.*;

public class Assig2Q2 {
    public static void main(String[] args){
        int num, rev=0, rem, temp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = sc.nextInt();

        temp = num;
        while(temp!=0)
        {
            rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }
    if(num==rev)
        System.out.println("\n It is a Palindrome Number.");
    else
        System.out.println("\n It is not a Palindrome Number.");
    }
}