package Facade;

public class Demo {
    public static void main(String[] args) {
        ShapeMaster shapeMaster = new ShapeMaster();

        shapeMaster.drawCircle();
        shapeMaster.drawRectangle();
        shapeMaster.drawSquare();
    }
}
