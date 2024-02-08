public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 9);
        System.out.println("Area "+ rectangle.getArea());
        System.out.println("Area "+ rectangle.getPerimeter());

        Square square = new Square(5);
        System.out.println("Square Area" + square.getArea());
    }
}
