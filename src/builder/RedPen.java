package builder;

public class RedPen implements DrawingAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw circle (Color: Red, Radius: "+radius+" x:"+x+"  y:"+y+")");
    }
}
