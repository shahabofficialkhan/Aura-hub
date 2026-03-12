public class PersonalTask extends Task {
    private String Category;
    private static int personalTasksCount = 0;
    private static int completedPersonalTasksCount = 0;
    public PersonalTask(String title, String deadline, String Category) {
        super(title, deadline);
        setCategory(Category);
        personalTasksCount++;
    }
    //Setters
    public void setCategory(String Category) {this.Category = Category;}
    @Override
    public void Mark_a_Task_Done_Status(Boolean status) {
        if (status == null) {
            super.Mark_a_Task_Done_Status(false);   
        } else {
            super.Mark_a_Task_Done_Status(true);
            completedPersonalTasksCount++;
        }    }
    //Getters
    public String getCategory() {return Category;}
    public static int getPersonalTasksCount() {return personalTasksCount;}
    public static int getCompletedPersonalTasksCount() {return completedPersonalTasksCount;}

    
}
