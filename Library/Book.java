package library_stevenjin;
import java.util.*;

public class Book extends LibraryItem{
    
    private Boolean IsRequested;
    public Book(){
        super();
    }
    
    public Book(String ItemTitle,String ItemAuthor_Artist,int ItemID,boolean ItemOnLoan,Date ItemDueDate, boolean Isrequested){    
        super(ItemTitle,ItemAuthor_Artist,ItemID,ItemOnLoan,ItemDueDate);
        IsRequested= Isrequested;
    }
    
    public void printDetails()
    {
        System.out.println("Book Title: "+this.Title+"\nAuthor: "+this.Author_Artist+"\nBook ID: "+this.ItemID);
        if (OnLoan==true)
            System.out.println(this.Title+" is on loan");
        else 
            System.out.println(this.Title+" is not on loan");
        System.out.println(this.Title+" is due on "+this.DueDate);
        if (IsRequested==true)
            System.out.println(Title+" is requested");
        else 
            System.out.println(Title+" is not requested");
        System.out.println("");
    }
}