class Demo {
    Demo() {
        System.out.println("1");
    }
    Demo(int x) {
        this();
        System.out.println("2");
    }
    Demo(String s) {
        this(10);
        System.out.println("3");
    }
}

class Test {
    public static void main(String[] args) {
        new Demo("Hi");
    }
}
