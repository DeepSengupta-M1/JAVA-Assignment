import java.util.Scanner;
public class Assig4Q8
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age of Rahul");
    int x = sc.nextInt();
    System.out.println("Enter the age of Ayush");
    int y = sc.nextInt();
    System.out.println("Enter the age of Ajay");
    int z = sc.nextInt();
    if (x<y){
    if (x<z)
    System.out.println("THE YOUNGEST IS RAHUL");
    else
    System.out.println("THE YOUNGEST IS AJAY");
    }
    else if (y<z)
    System.out.println("THE YOUNGEST IS AYUSH");
    sc.close();
    }
}