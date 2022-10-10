package builder;

public class GreenPen implements DrawingAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw circle (Color: Green, Radius: "+radius+" x:"+x+"  y:"+y+")");
    }
}
