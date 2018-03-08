package library_stevenjin;
import java.util.*;
/**
 * @author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2018/3/6
 * Brief instruction: This program is a Library program.
 */

public class Library_StevenJin {

  
    public static void main(String[] args) {
        Book a = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false);
        a.printDetails();
        a.Borrowing();
        
        CD b = new CD("And Justice for all", "Metallica", 567, false, new Date(),  "Metal");
        b.printDetails();
        b.Borrowing();
        b.Returning();
        
        LibraryItem c= new Book("Journal to the west", "Wu Chengen", 9876, true, new Date(), false);
        
        c.printDetails();
        c.Borrowing();
    }
    
}
