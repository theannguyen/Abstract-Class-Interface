package BaiTap7;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.4, "black", true);
        shapes[1] = new Rectangle("blue", true, 3.5, 4.5);
        shapes[2] = new Square("red", true, 4.5);

        System.out.println("Mảng trước khi random: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("Mảng sau khi random: ");
        for (Shape shape1 : shapes) {
            shape1.resize(Math.random() * 100);
            System.out.println(shape1);
        }
    }
}
