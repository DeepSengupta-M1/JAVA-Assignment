public class Assig3Q9 {
    String name;
    int rollNo;
    int age;

    Assig3Q9() {
        name = "Shubh";
        rollNo = 05;
        age = 22;
    }

    void display() {
        System.out.println("Student's name: " + name);
        System.out.println("\n Student's roll no: " + rollNo);
        System.out.println("\n Student's age: " + age);
    }

    public static void main(String[] args) {
        Assig3Q9 st = new Assig3Q9();
        st.display();
    }
}