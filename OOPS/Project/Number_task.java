public class Number_task {
    private int numberofTasks;
    private int numberofCompletedTasks;
    Number_task(int totalTasks, int completedTasks){
        setNumberofCompletedTasks(completedTasks);
        setNumberofTasks(totalTasks);
    }
    //Setters
    public void setNumberofTasks(int numberofTasks) {this.numberofTasks = numberofTasks;}
    public void setNumberofCompletedTasks(int numberofCompletedTasks) {this.numberofCompletedTasks = numberofCompletedTasks;}
    //Getters   
    public int getNumberofTasks() {return numberofTasks;}
    public int getNumberofCompletedTasks() {return numberofCompletedTasks;}

   
}
