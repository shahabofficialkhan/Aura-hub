class A {
    A(int a) { System.out.println("int"); }
    A(double a) { System.out.println("double"); }
}

class Test {
    public static void main(String[] args) {
        A a = new A(5.5f);
    }
}
