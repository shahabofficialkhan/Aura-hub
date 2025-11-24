class Course {
   private String courseTitle ;
   private int coursecode ;
   private int coursecredithours;
   void Setter (String courseTitle , int coursecode , int coursecredithours){
       this.courseTitle = courseTitle ;
       this.coursecode = coursecode ;
       this.coursecredithours = coursecredithours;
   }
   void Getter (){
       System.out.println("Course Title        : " + courseTitle);
       System.out.println("Course Code         : " + coursecode);
       System.out.println("Course Credit Hours : " + coursecredithours);
   }

} 
