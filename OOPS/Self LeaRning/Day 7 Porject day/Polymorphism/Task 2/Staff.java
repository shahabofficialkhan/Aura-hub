public class Staff extends Person {
    private double pay;
    Staff(String name, String address, double pay) {
        super(name, address);
        setPay(pay);
    }

    //Setter
    public void setPay(double pay) {this.pay = pay;}
    //Getter
    public void getPay() {System.out.println("Pay: " + pay);

    }

     void diaplayStudentinfo (){
        super.displayInfo();
        getPay();
    }
}