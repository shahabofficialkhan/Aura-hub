public class Circle {
   // Make a class Circle that has two private attribute color and radius. 
   // Create a fully parameterized constructor. 
   // This class has a method calculateArea(), which calculates area of circle. 
   // This class is inherited by Cylinder that has one private attribute height.
   //  Create a fully parameterized constructor. 
   // This class overrides calculateArea() method.
    private String color;
    private double radius;
    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


}
