public class Test {
    public static void main(String[] args) {

        try {
            Circle c = new Circle(5);

            System.out.println("Radius: " + c.getRadius());
            System.out.println("Area: " + c.calculateArea());
            System.out.println("Perimeter: " + c.calculatePerimeter());

            // Update radius
            c.setRadius(12);

            System.out.println("\nUpdated Radius: " + c.getRadius());
            System.out.println("Updated Area: " + c.calculateArea());
            System.out.println("Updated Perimeter: " + c.calculatePerimeter());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
