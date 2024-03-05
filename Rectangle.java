public class Rectangle extends AbstractShape{

    private Point topLeft;
    private Point bottomRight;

    public Rectangle() {
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getPerimeter() {
        Point bottomLeft = new Point(topLeft.getX(), bottomRight.getY());
        double length = Point.calculateDistance(topLeft, bottomLeft);
        double width = Point.calculateDistance(bottomLeft, bottomRight);
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        Point bottomLeft = new Point(topLeft.getX(), bottomRight.getY());
        double length = Point.calculateDistance(topLeft, bottomLeft);
        double width = Point.calculateDistance(bottomLeft, bottomRight);
        return length*width;
    }

    @Override
    public String toString() {
        return "{Type="+getType()+", TopLeft=[Point X="+topLeft.getX()+", Y="+topLeft.getY()
                +"], BottomRight=[Point X="+bottomRight.getX()+", Y="+bottomRight.getY()+"]}";

    }
}