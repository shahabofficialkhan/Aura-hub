public class ContentCreatorTask extends Task {
     private String platform;
     private String contentType;
     private static int contentCreatorTasksCount = 0;
     private static int completedContentCreatorTasksCount = 0;


    public ContentCreatorTask(String title, String deadline, String platform, String contentType) {
        super(title, deadline);
        setPlatform(platform);
        setContentType(contentType);
        contentCreatorTasksCount++;
    }
//setters
    public void setPlatform(String platform) { this.platform = platform; }
    public void setContentType(String contentType) { this.contentType = contentType; }
    @Override
    public void Mark_a_Task_Done_Status(Boolean status) {
            if (getStatus() == null) {
                Mark_a_Task_Done_Status(false);
            } else
            {Mark_a_Task_Done_Status(true);
                contentCreatorTasksCount++;}
        }

    public String getPlatform() {  return platform;}
    public String getContentType() {  return contentType;}
}