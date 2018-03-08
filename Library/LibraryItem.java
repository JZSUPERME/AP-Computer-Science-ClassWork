package library_stevenjin;
import java.util.*;

public class LibraryItem {
    protected String Title;
    protected String Author_Artist;
    protected int ItemID;
    protected boolean OnLoan;
    protected Date DueDate;
    
public LibraryItem(){
    Title="";
    Author_Artist="";
    ItemID=00000;
    OnLoan=true;
}
private static Date addDays(Date date, int days){
    GregorianCalendar cal=new GregorianCalendar();
    cal.setTime(date);
    cal.add(Calendar.DATE,days);
    return cal.getTime();
}
public LibraryItem(String ItemTitle,String ItemAuthor_Artist,int ItemItemID,boolean ItemOnLoan,Date ItemDueDate){
    Title=ItemTitle;
    Author_Artist=ItemAuthor_Artist;
    ItemID=ItemItemID;
    OnLoan=ItemOnLoan;
    DueDate= ItemDueDate;
}

public String getTitle() { 
    return Title; 
}
public String getAuthor_Artist() { 
    return Author_Artist; 
}
public int getItemID() { 
    return ItemID; 
}
public boolean getOnLoan() { 
    return OnLoan; 
}
public Date getDueDate() { 
    return DueDate; 
}
public void Borrowing(){
    if (this.OnLoan==true)
        System.out.println(this.Title+" is on loan.");
    else{
        this.OnLoan=true;
        System.out.println("You have just borrowed "+this.Title);
        Date today= new Date();
        DueDate=addDays(today,14);
        System.out.println("Due date is now " + DueDate);
    }
    System.out.println("");
}
public void Returning(){
    this.OnLoan=false;
    System.out.println("You have just returned "+this.Title+". Welcome next time");
    System.out.println("");
}
public void printDetails()
    {
        System.out.println("Title: "+this.Title+"\nAuthor: "+this.Author_Artist+"\nID: "+this.ItemID);
        if (OnLoan==true)
            System.out.println(this.Title+" is on loan");
        else 
            System.out.println(this.Title+" is not on loan");
        System.out.println(this.Title+" is due on "+this.DueDate);
        System.out.println("");
    }

}
