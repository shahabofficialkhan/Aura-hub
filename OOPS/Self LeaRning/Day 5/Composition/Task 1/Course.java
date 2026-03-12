public class Course{
    private String cousretitle;
    private String coursecode;
    Course(String cousretitle, String coursecode){
       setCoursecode(coursecode);
       setCousretitle(cousretitle);
    }
    //Setter Method 
    public void setCousretitle(String cousretitle){
        this.cousretitle = cousretitle;
    }
    public void setCoursecode(String coursecode){
        this.coursecode = coursecode;
        
    }

    //Getter Method 
    public String getCousretitle(){
        return cousretitle;
    }
    public String getCoursecode(){
        return coursecode;
    }
}

