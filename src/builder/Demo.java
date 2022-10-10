package builder;

public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10, new RedPen());
        Shape greenCircle = new Circle(100, 100, 10, new GreenPen());

        redCircle.draw();
        greenCircle.draw();
    }
}
