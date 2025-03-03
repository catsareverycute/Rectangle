import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        Rectangle original = new Rectangle();
        original.setX1(10);
        original.setY1(15);
        original.setLength(20);
        original.setWidth(10);
        for (int i = 0; i < 1000001; i++){
            rectangles.add(new Rectangle());
        }
        for (int i = 0; i < 1000001; i++){
            original.collide(original,rectangles.get(i));
        }
        System.out.println(original.percent());
    }
}