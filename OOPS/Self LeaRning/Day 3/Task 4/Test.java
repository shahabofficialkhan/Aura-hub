class Car {
    Car() {
        System.out.println("Start");
    }
    Car(String a) {
        this();
        System.out.println(a);
    }
    Car(String a, int b) {
        this(a);
        System.out.println(b);
    }
}

class Test {
    public static void main(String[] args) {
        new Car("Honda", 2024);
    }
}
