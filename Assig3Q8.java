public class Assig3Q8 {
    int id;
    String name;

    Assig3Q8() {
        System.out.println("This a default constructor");
    }

    Assig3Q8(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        Assig3Q8 s = new Assig3Q8();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : " + s.id + "\nStudent Name : " + s.name);

        System.out.println("\nParameterized Constructor values: \n");
        Assig3Q8 student = new Assig3Q8(10, "David");
        System.out.println("Student Id : " + student.id + "\nStudent Name : " + student.name);
    }
}