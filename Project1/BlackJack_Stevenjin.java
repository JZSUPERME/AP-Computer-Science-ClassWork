package blackjack_stevenjin;

import java.util.*;
/**@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/12/27
 * Brief instruction: This program is a BlackJack game.
 */
public class BlackJack_Stevenjin {


    public static void main(String[] args) {
    
   
    Scanner input = new Scanner(System.in);
    
    int CompCount=1;
    int Compsum=0;
    int PlayerCount=1;
    int Playersum=0;
    System.out.println("Welcome to Black Jack");
    //First dealer's turn
    
    int Computer= (int)(13 * Math.random()+1);
    System.out.println("\nDealer turn 1: " + Computer);
        
        //Number definded for computer
        if (Computer==11||Computer==12||Computer==13)
            {Computer=10;
            Compsum+=Computer;}
        else if (Computer==1)
            {if (Compsum<=10)
                {Computer=1;
                Compsum+=Computer;}
            else
                {Computer=11;
                Compsum+=Computer;}
            }
        else
            {Compsum+=Computer;}
        
    //First player's turn
    int Player= (int)(13 * Math.random()+1);
    System.out.println("\nPlayer turn 1 : " + Player);
        
        //Number definded for player
        if (Player==11||Player==12||Player==13)
            {Player=10;
            Playersum+=Player;}
    
        else if (Player==1)
            {System.out.print("What value would you use for A(1,11): "); 
            int choice = input.nextInt();
            
            if(choice==1)
                {Player=1;
                Playersum+=Player;}
            else if(choice==11)     
             {Player=11;
              Playersum+=Player;}}
        
        else
            {Playersum+=Player;}
    
    
    
    for(CompCount=2;CompCount<=5&&Compsum<=17;CompCount++)
        {Computer= (int)(13 * Math.random()+1);
        System.out.println("\nDealer turn " + CompCount+ ": hide" );
    
        if (Computer==11||Computer==12||Computer==13)
            {Computer=10;
            Compsum+=Computer;}
    
        else if (Computer==1)
            {if (Compsum<=10)
                {Computer=1;
                Compsum+=Computer;}
            else
                {Computer=11;
                Compsum+=Computer;}
            }
    
        else
            {Compsum+=Computer;}
        }
    
    for(PlayerCount=2;PlayerCount<=5;PlayerCount++)
       {Player= (int)(13 * Math.random()+1);
        System.out.println("\nPlayer turn " + PlayerCount+": " +Player);
        
        //Number definded for player
        if (Player==11||Player==12||Player==13)
            {Player=10;
            Playersum+=Player;}
    
        else if (Player==1)
            {System.out.print("\nWhat value would you use for A(1,11): "); 
            int choice = input.nextInt();
            
            if(choice==1)
                {Player=1;
                Playersum+=Player;}
            else if(choice==11)     
             {Player=11;
              Playersum+=Player;}}
        
        else
            {Playersum+=Player;}
        
        System.out.println("\nPlayer's total: "+Playersum);
        if (Playersum<=21)
            {System.out.print("Do you want to do next hit(true/false): ");
        
            boolean next=input.nextBoolean();
         
            if(next== true)
                continue;
            else
                break;
            }
        else
            break;}
    
    if(Compsum<21)
        if(CompCount>=6)
            System.out.print("\nDealer five small tiger win");
        else
            System.out.println("\nDealer: " + Compsum);
    else if(Compsum==21)
        if(CompCount>=6)
            System.out.print("\nDealer five small tiger");
        else
            System.out.println("\nDealer Blackjack!!!!" );
    else
        System.out.println("\nDealer Boom!");
    
    if(Playersum<21)
        if(PlayerCount>=5)
            System.out.print("\nPlayer five small tiger");
        else
            System.out.println("\nPlayer: " + Playersum);
    else if(Playersum==21)
        if(PlayerCount>=5)
            System.out.print("\nPlayer five small tiger");
        else
            System.out.println("\nPlayer Blackjack!!!!" );
    else
       System.out.println("\nPlayer Boom!" );
    
    if(Compsum>21)
       System.out.println("\nPlayer win!!!!" ); 
    else if(CompCount==5&&Compsum<=21&&PlayerCount!=5)
       System.out.println("\nDealer win!!!!" ); 
    else if(PlayerCount>=5&&Playersum<=21)
       System.out.println("\nPlayer win!!!!" ); 
    else if(Compsum<=21&&Playersum>21)
       System.out.println("\nDealer win!!!!" ); 
    else if(Compsum<=21&&Playersum<=21&&CompCount<5&&PlayerCount<5)
        {if(Compsum<=Playersum)
            System.out.println("\nPlayer win!!!!" );
        else
            System.out.println("\nDealer win!!!!" );
            }
    
        }
    
}
       
            
               
        
    
     

