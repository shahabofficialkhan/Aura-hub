public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        setProgram(program);
        setYear(year);
        setFee(fee);

    }

    // Setter
    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // Getter
    public void getProgram() {
        System.out.println("Program: " + program);
    }

    public void getYear() {
        System.out.println("Year: " + year);
    }

    public void getFee() {
        System.out.println("Fee: " + fee);
    }

    void diaplayStudentinfo() {
        super.displayInfo();
        getProgram();
        getYear();
        getFee();
    }

}
