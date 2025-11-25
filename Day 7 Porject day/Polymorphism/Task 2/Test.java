import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
         
     ArrayList<Person> people = new ArrayList<Person>(3);
    for (int i = 0 ; i < 3 ; i++)
    {
      System.out.println("Enter 1 for Student and 2 for Staff:");
      int choice = Integer.parseInt(System.console().readLine());
      if (choice == 1){
        System.out.println("Enter name:");
        String name = System.console().readLine();
        System.out.println("Enter address:");
        String address = System.console().readLine();
        System.out.println("Enter program:");   
        String program = System.console().readLine();
        System.out.println("Enter year:");
        int year = Integer.parseInt(System.console().readLine());
        System.out.println("Enter fee:");
        double fee = Double.parseDouble(System.console().readLine());
        people.add(new Student(name, address, program, year, fee));
    } else {
        System.out.println("Enter name:");
        String name = System.console().readLine();
        System.out.println("Enter address:");
        String address = System.console().readLine();
        System.out.println("Enter pay:");
        double pay = Double.parseDouble(System.console().readLine());
        people.add(new Staff(name, address, pay));
    }

  }
  for (Person p : people){
    if (p instanceof Student){
      Student s = (Student) p; // Downcasting
      s.diaplayStudentinfo();



    } else if (p instanceof Staff){
        ((Staff) p).diaplayStudentinfo();// Downcasting in single line
    }
    System.out.println();
  }
}
}