public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Shahab",102);
        Employee emp3 = new Employee("Shahab",102 ,"123456");
    
        System.out.println(emp3.getName());
        emp2.set("Ahsan", 90);
        System.out.println(emp2.getName()+" " +emp2.getId());
 
    }
}