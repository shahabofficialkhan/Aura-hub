public class PermanentFaculty extends Faculty {
    private double salary;
  PermanentFaculty (String id , String name , double salary){
    super(id, name);
   this.salary = salary;
  }
    @Override
     void calculatesalary (){
     System.out.println("The Parmanent Salaray :" + salary);
     }

    @Override
   public String toString(){
    return String.format(super.toString()+"PM Salary" + salary);
   }

}
