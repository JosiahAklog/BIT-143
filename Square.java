public class Square extends Rectangle{

    public Square(Point topLeft, int length) {
        super(topLeft, new Point(topLeft.getX()+length, topLeft.getY()-length));
    }

    public Square() {
    }

    public String getType() {
        return "Square";
    }

}