import java.time.LocalDate;

public class Task {
 // User Will set them. 
        private String title;
        private static LocalDate deadline;
        
        private Boolean status = false;
        private LocalDate taskCompletingDate;
        private static int totalTasks = 0;
        static int completedTasks = 0;



        // Constructor
        public Task(String title, LocalDate deadline) {
            setDeadline(deadline);
            setTitle(title);
            totalTasks++;
        }

        //Setters 
        public void setTitle(String title) {this.title = title;}
        public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;}
        public void  settaskCompletingDate(LocalDate taskCompletingDate){
            this.taskCompletingDate=taskCompletingDate;
        }
        protected void setstatus(Boolean status) {this.status = status;}
        public void Mark_a_Task_Done_Status(Boolean status ,LocalDate taskCompletingDate) 
          {
            if(status)
                if (taskCompletingDate.isBefore(deadline)|| taskCompletingDate.equals(deadline))
                    {  
                        completedTasks++;
                        settaskCompletingDate(taskCompletingDate);
                        System.out.println("Task No "+ completedTasks +" completed");
                        setstatus(true);
                     
                    }
          }
        
        //Getters
        public String getTitle() {return title;}
        public LocalDate getDeadline() {return deadline;}
        public Boolean getStatus() {return status;}
        public static int getTotalTasks() {return totalTasks;}
        public LocalDate gettaskCompletingDate(){
            return taskCompletingDate;
        }
    
      



   public static void main(String[] args) {
    
       System.out.println("Total Tasks: " + getTotalTasks());
    //    System.out.println("Main Ok");
      Task T1 = new Task("Study", LocalDate.of(2025, 6, 1));
        T1.Mark_a_Task_Done_Status(true ,LocalDate.of(2025, 4, 30)  );
        System.out.println("Task Title: " + T1.getTitle());
        System.out.println("Task Deadline: " + T1.getDeadline());
        System.out.println("CompltingDate: "+ T1.gettaskCompletingDate());
        System.out.println("Task Status: " + T1.getStatus());
        System.out.println("Complete Task :" + T1.completedTasks);
        System.out.println("Total Tasks: " + getTotalTasks());

         }
        }