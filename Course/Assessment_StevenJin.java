package course_stevenjin;

/**
 *
 * @author JZSUPERME
 */
public class Assessment_StevenJin {
    private String assessmentTitle;
    private int maxMarks;
   
    public Assessment_StevenJin(){
        assessmentTitle="";
        maxMarks=100;
   }
    
    public Assessment_StevenJin(String assessmentTitle,int maxMarks){
        this.assessmentTitle=assessmentTitle;
        this.maxMarks=maxMarks;
   }
    
    public String toString ()
    {
        return "Assessment Title: "+this.assessmentTitle+"\nMaxium Mark: "+this.maxMarks;
    }
    
    public void PrintDetails(){
        System.out.println("Assessment title is "+ this.assessmentTitle);
        System.out.println("Max mark of this assessment is "+ this.maxMarks);
    }
}
