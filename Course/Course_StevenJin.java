package course_stevenjin;
import java.util.*;
/**
 *
 * @author JZSUPERME
 */
public class Course_StevenJin {
    private String courseTitle;
    private int maxStudents;
    private int numberOfLessons;
    
    public Lesson_StevenJin [] courseLesson;
    public Assessment_StevenJin Assessment;
    
    public Course_StevenJin (){
    courseLesson =new Lesson_StevenJin[50];
        numberOfLessons=0;
        Assessment= new Assessment_StevenJin();
    
    }
    
    public void addLesson(String title, int mins, boolean lab)
    {
        Lesson_StevenJin Lesson= new Lesson_StevenJin(title, mins,lab);
        courseLesson[numberOfLessons]=Lesson;
        numberOfLessons++;
    }
    
    public void addAssessment(String title, int mark)
    {
        Assessment = new Assessment_StevenJin(title,mark);
    }
    
    
    public void printDetails()
    {
        String printD = "";
        for (int i=0; i<numberOfLessons; i++)
        {
            printD = printD + "Lesson "+(i+1)+"\n"+courseLesson[i].toString()+"\n";
        }
        System.out.println("Course\n\nLesson Details: \n"+printD+"\nAssesment Details: \n"+Assessment);
    }
    
    public static void main(String[] args)
    {
        Course_StevenJin a=new Course_StevenJin();
        a.addLesson("Binary search", 11, true);
        a.addLesson("ArrayList", 20, false);
        a.addAssessment("What is attribute?", 100);
        a.printDetails();
    }   
}
