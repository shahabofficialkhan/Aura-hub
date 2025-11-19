class Student {
    int marks;
    Student() { marks = 50; }
    Student(int m) { marks = m; }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(s1.marks + 20);
        System.out.println(s2.marks);
    }
}
