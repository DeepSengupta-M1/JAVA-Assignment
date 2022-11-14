public class Assig3Q6 {
    static int count = 0;

    Assig3Q6() {
        count++;
    }

    public static void main(String[] args) {
        Assig3Q6 obj1 = new Assig3Q6();
        Assig3Q6 obj2 = new Assig3Q6();
        Assig3Q6 obj3 = new Assig3Q6();
        Assig3Q6 obj4 = new Assig3Q6();
        System.out.println("Number of objects created: " + count);
    }
}