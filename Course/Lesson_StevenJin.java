package course_stevenjin;

/**
 *
 * @author JZSUPERME
 */
public class Lesson_StevenJin{
   private String lessonTitle;
   private int durationTime;
   private boolean requiresLab;
   
   public Lesson_StevenJin(){
   lessonTitle="";
   durationTime=0;
   requiresLab=false;
   }
   
   public Lesson_StevenJin(String lessonTitle, int durationTime, boolean requiresLab){
    this.lessonTitle= lessonTitle;
    this.durationTime = durationTime;
    this.requiresLab = requiresLab;
   }
   
   public String toString()
    {
        return "Lesson Title: "+lessonTitle+"\nDuration Minutes: "+durationTime+"\nRequires Lab: "+requiresLab;
    }
   
   public void PrintDetails(){
        System.out.println("Lesson title is "+ this.lessonTitle);
        System.out.println("The duration time of " + this.lessonTitle +"is "+ this.durationTime);
        if(this.requiresLab==true)
            System.out.println(this.lessonTitle + " requires lab");
        else
            System.out.println(this.lessonTitle + " does not requires lab");
    }
}
