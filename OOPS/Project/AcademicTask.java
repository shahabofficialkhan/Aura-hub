public class AcademicTask extends Task {
    private String subject;
    private String Tasktype;
    private static int academicTasksCount = 0;
    private static int completedAcademicTasksCount = 0;

    public AcademicTask(String title, String deadline, String subject, String Tasktype) {
        super(title, deadline);
        setSubject(subject);
        setTasktype(Tasktype);
        academicTasksCount++;
    }
    //Setters
    public void setSubject(String subject) {this.subject = subject;}
    public void setTasktype(String Tasktype) {this.Tasktype = Tasktype;}
    @Override
    public void Mark_a_Task_Done_Status(Boolean status)
     {  
        if (status) {
            if ()
            super.Mark_a_Task_Done_Status(true);
            completedAcademicTasksCount++;
        } else {super.Mark_a_Task_Done_Status(false); }
     }

    //Getters
    public String getSubject() {return subject;}
    public String getTasktype() {return Tasktype;}
    public static int getAcademicTasksCount() {return academicTasksCount;}
    public static int getCompletedAcademicTasksCount() {return completedAcademicTasksCount;}

}
