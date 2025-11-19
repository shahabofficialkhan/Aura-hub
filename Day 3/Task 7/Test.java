class Num {
    int n;
    Num(int n) {
        this.n = n;
    }
}

class Test {
    public static void main(String[] args) {
        Num x = new Num(7);
        Num y = x;
        y.n = 14;
        System.out.println(x.n);
    }
}
