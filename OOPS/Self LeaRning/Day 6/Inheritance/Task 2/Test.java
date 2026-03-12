public class Test {
    public static void main(String[] args) {
         
      Student student = new Student ("shahab", 
      Address.createAddress("Kohat " , "Pakistan "),
       "BSSE", 4 , 150000);
    
    Staff staff = new Staff ("Ali", 
    Address.createAddress("Peshawar" , "Pakistan "),
    50000);
   

    System.out.println("Student Information:");
    student.diaplayStudentinfo();
    System.out.println("\nStaff Information:");
    staff.diaplayStudentinfo();
    }
}
