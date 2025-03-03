public class Rectangle {
    private int x1;
    private int y1;
    private int length;
    private int width;
    private static int count;

    public Rectangle(){
        x1 = (int) (Math.random()*51);
        y1 = (int) (Math.random()*51);
        length = (int) (Math.random()*41+10);
        width = (int) (Math.random()*6+5);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void collide(Rectangle og, Rectangle test){
        int originalX1 = og.getX1();
        int originalY1 = og.getY1();
        int originalX2 = og.getX1()+og.getLength();
        int originalY2 = og.getY1()-og.getWidth();
        int testX1 = test.getX1();
        int testY1 = test.getY1();
        int testX2 = test.getX1()+test.getLength();
        int testY2 = test.getY1()-test.getWidth();
        // (x1,y1) (x2,y1) (x2,y2) (x1,y2)
        if (originalX1 <= testX2 && testX2 <= originalX2 && originalY1 >= testY2 && testY1 >= originalY2 ){
            count++;
        }
        else if (originalX1 <= testX2 && testX2 <= originalX2 && originalY1 <= testY1 && testY2 <= originalY2 ){
            count++;
        }
        else if (originalX1 >= testX1 && testX2 >= originalX2 && originalY1 >= testY1 && testY1 >= originalY2 ){
            count++;
        }
        else if (originalX1 <= testX2 && testX2 <= originalX2 && originalY1 >= testY1 && testY2 <= originalY2 ){
            count++;
        }
        else if ((og.getX1() <= test.getX1()) && (test.getX1() <= (og.getX1()+og.getLength())) && ((og.getY1() - og.getWidth()) <= test.getY1()) && (og.getY1() >= test.getY1())){
            count++;
        }
        /* else if ((test.getX1() + test.getLength() <= og.getX1() + og.getLength()) && og.getX1() ) {
        } */
        for (int i = test.getX1(); i < test.getX1()+test.getLength();i++){
            for (int j = test.getY1(); j < test.getY1() + test.getWidth(); j++) {

            }
        }
    }

    public double percent() {
        return (double)(count)/1000000 * 100;
    }
}
