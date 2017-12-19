package rock_paper_scissors_game_stevenjin;

import java.util.Scanner;

/**@author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/09/20
 * Brief instruction: This program is a rock-paper-stone-game.
 */

public class Rock_Paper_Scissors_game_StevenJin {

    public static void main(String[] args) {
    
    System.out.println("Rock = 0; Paper = 1; Scissors = 2");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your choice (only 0,1,2): ");
    
    int Player = input.nextInt();
    double Computer= (int)(3 * Math.random());
    
    if (Computer==0){
        System.out.println("Computer: Rock");
    }else if(Computer==1){
        System.out.println("Computer: Paper");
    }else{
        System.out.println("Computer: Scissors");
    }
    
    if (Player==0){
        System.out.println("Player: Rock");
    }else if(Player==1){
        System.out.println("player: Paper");
    }else if(Player==2){
        System.out.println("Player: Scissors");
    }
    
    System.out.println(" "); //Leave a blank line
    
    if (Player == 0){
        if (Computer == 0){
           System.out.println("Tied");
        }else if(Computer == 1){
           System.out.println("Computer Wins");
        }else{ 
           System.out.println("Player Wins!!!!");}
    } 
    else if (Player == 1){
        if (Computer == 0){
           System.out.println("Player Wins!!!!");
        }else if(Computer == 1){
           System.out.println("Tied");
        }else{ 
           System.out.println("Computer Wins");}
    }
    else if (Player == 2){
        if (Computer == 0){
           System.out.println("Computer Wins");
        }else if(Computer == 1){
           System.out.println("Player Wins!!!!");
        }else{ 
           System.out.println("Tied");}
        }
    else { 
           System.out.println("Input Error");
        }  
    }
}