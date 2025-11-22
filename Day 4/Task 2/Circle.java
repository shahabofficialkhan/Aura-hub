public class Circle {

    private double radius;

    // Mandatory constructor with validation
    public Circle(double radius) {
        setRadius(radius);   // Using setter ensures single validation logic
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter with validation
    public final void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        this.radius = radius;
    }

    // Area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Perimeter
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
