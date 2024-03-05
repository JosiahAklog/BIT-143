public abstract class AbstractShape implements Shape {

    public int compareTo(Shape other) {
        if (getArea() < other.getArea()) {
            return -1;
        } else if (getArea() > other.getArea()) {
            return 1;
        } else {
            if (getPerimeter() < other.getPerimeter()) {
                return -1;
            } else if (getPerimeter() > other.getPerimeter()) {
                return 1;
            } else {
                return getType().compareTo(other.getType());
            }
        }
    }
}
