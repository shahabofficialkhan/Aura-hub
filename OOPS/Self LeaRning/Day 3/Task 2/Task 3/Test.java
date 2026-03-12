class Box {
    int x;
    Box(int x) {
        this.x = x;
    }
    Box(Box b) {
        this.x = b.x + 5;
    }
}

class Test {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box(b1);
        System.out.println(b2.x);
    }
}
