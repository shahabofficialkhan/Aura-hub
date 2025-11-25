public class VisitingFaculty extends Faculty {
    double hours;
    double salaryPrHr;
    double totalsalary = hours*salaryPrHr;

    VisitingFaculty (String id , String name , double hours ,double salaryPrHr){
    super(id, name );
    this.hours = hours;
    this.salaryPrHr=salaryPrHr;

  }
    @Override
     void calculatesalary (){
     System.out.println("The Parmanent Salaray :" + totalsalary);
     }
     @Override
   public String toString(){
    return String.format(super.toString() + "VS Salary " + totalsalary);
   }

}
