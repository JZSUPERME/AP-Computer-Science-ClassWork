package library_stevenjin;
import java.util.*;

public class CD extends LibraryItem{
    
    private String Genre;
    public CD(){
        super();
    }
    
    public CD(String ItemTitle,String ItemAuthor_Artist,int ItemID,boolean ItemOnLoan, Date ItemDueDate, String genre){    
        super(ItemTitle,ItemAuthor_Artist,ItemID,ItemOnLoan,ItemDueDate);
        Genre= genre;
    }
    
    public void printDetails()
    {
        System.out.println("Book Title: "+this.Title+"\nArtist: "+this.Author_Artist+"\nCD ID: "+this.ItemID);
        if (OnLoan==true)
            System.out.println(this.Title+" is on loan");
        else 
            System.out.println(this.Title+ " is not on loan");
        System.out.println(this.Title+" is due on "+this.DueDate);
        System.out.println(this.Title+" is belongs to "+this.Genre);
        System.out.println("");
    }
}
