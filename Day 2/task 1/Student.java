public class Student {
    private String name;
	private int roll;
	private double cgpa;
    //Constructor

//Set Method
public void setName (String name){
    this.name = name;
    };
	public void setRoll(int roll){
        this.roll=roll;
    }
	
	public void setCgpa(double cgpa){
        this.cgpa=cgpa;
    }
	public  String getName(){
        return name;
    }
	public int getRoll(){
return roll;
    }
	public double getCgpa(){
        return cgpa;
    }
}
