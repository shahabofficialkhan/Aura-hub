class A {
    int val;
    A(int v) {
        val = v;
    }
}

class Test {
    public static void main(String[] args) {
        A a1 = new A(5);
        A a2 = a1;
        a2.val = 20;
        System.out.println(a1.val);
    }
}
