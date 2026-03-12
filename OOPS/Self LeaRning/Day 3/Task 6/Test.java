class P {
    int a = 10;
    P() { a = 20; }
}

class Test {
    public static void main(String[] args) {
        P p = new P();
        System.out.println(p.a);
    }
}
