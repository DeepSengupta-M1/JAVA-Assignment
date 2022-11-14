public class Assig3Q7 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        Square obj2 = new Square();
        obj2.Area(20);
        obj2.Area(5.2);
    }
}

class Square {
    void Area(double side) {
        System.out.println("Area of the Square: " + side * side);
    }

    void Area(float side) {
        System.out.println("Area of the Square: " + side * side);
    }
}

class Rectangle {
    void Area(double l, double b) {
        System.out.println("Area of the rectangle: " + l * b);
    }

    void Area(int l, int b) {
        System.out.println("Area of the rectangle: " + l * b);
    }
}