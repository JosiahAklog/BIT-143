public class Circle extends AbstractShape{

    private Point center;
    private int radius;

    public Circle() {
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }


    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "{Type=Circle, Center=[Point X="+center.getX()+", Y="+center.getY()+"], Radius="+radius+"}";
    }
}