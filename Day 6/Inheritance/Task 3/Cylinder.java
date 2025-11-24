public class Cylinder extends Circle {
    private double height ;
    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }
    @Override
    public double calculateArea() {
        double baseArea = super.calculateArea();
        double lateralArea = 2 * Math.PI * getRadius() * height;
        System.out.printf("Area of Cylinder : " + (2 * baseArea + lateralArea));
        return (2 * baseArea) + lateralArea;
    }
}
