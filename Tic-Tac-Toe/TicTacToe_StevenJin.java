package tic.tac.toe_stevenjin;

import java.util.*;

/**
 * @author Steven Jin S3C7
 * Instructor: Daniel Gunn
 * Date:2017/11/23
 * Brief instruction:This program is a tic-tac-toe game
 */
    public class TicTacToe_StevenJin{
    
    private static String[][] board;
    private static final int ROWS = 3; 
    private static final int COLS = 3;
    
    //Create a new empty board
    public TicTacToe_StevenJin(){
    board = new String[ROWS][COLS]; 
    for (int r = 0; r < ROWS; r++)
        for (int c = 0; c < COLS; c++) 
            board[r][c] = " ";
    }
    
    /** @param r the row number
    * @param c the column number
    * @param symbol the symbol to be placed on board[r][c]
    * Precondition: These quare board[r][c]is empty.
    * Postcondition: symbol placed in that square. 
    */
    
    public void makeMove(int r,int c,String symbol){
        board[r][c] = symbol;
    }
    
    public String toString(){
    String symbol="";
        for(int r=0;r<ROWS;r++) {
            symbol = symbol + "|";
            for (int c = 0; c < COLS; c++)
                symbol = symbol + board[r][c]; 
                symbol = symbol + "|\n";
        }
    return symbol;
    }
    
    public static void main(String[] args) {
    TicTacToe_StevenJin game = new TicTacToe_StevenJin();
    int n=1;
    String symbol="";
    Scanner input = new Scanner(System.in);
    
    while(true){
    if(n%2==1)
        {System.out.println("Player1's "+(n+1)/2+" turn");
        symbol="O";}
    else 
        {System.out.println("Player2's "+(n)/2+" turn");
        symbol="X";}
        
    System.out.print("Row:");
    int r= input.nextInt()-1;
    System.out.print("Column:");
    int c= input.nextInt()-1;
    
    game.makeMove(r,c,symbol);
    System.out.println(game.toString());
    
    if(n==9){
        if(board[0][c].equals(board[1][c])&&board[1][c].equals(board[2][c])){
            System.out.println("player 1 win");
            break;}
        else if(board[r][0].equals(board[r][1])&&board[r][1].equals(board[r][2])){
            System.out.println("player 1 win");
            break;}
        else if(board[0][0].equals(board[1][1])&&board[1][1].equals(board[2][2])){
            System.out.println("player 1 win");
            break;}
        else if(board[0][2].equals(board[1][1])&&board[1][1].equals(board[2][0])){
            System.out.println("player 1 win");
            break;}
        else{
            System.out.println("tied");
            break;
        }
    }
    
    else{
        if(n%2==1){
            if(board[0][c].equals(board[1][c])&&board[1][c].equals(board[2][c])){
                System.out.println("player 1 win");
                break;}
            else if(board[r][0].equals(board[r][1])&&board[r][1].equals(board[r][2])){
                System.out.println("player 1 win");
                break;}
            else if(board[0][0].equals(board[1][1])&&board[1][1].equals(board[2][2])&&board[2][2].equals("O")){
                System.out.println("player 1 win");
                break;}
            else if(board[0][2].equals(board[1][1])&&board[1][1].equals(board[2][0])&&board[2][0].equals("O")){
                System.out.println("player 1 win");
                break;}
            else
                n++;}
        
        else if(n%2==0){
            if(board[0][c].equals(board[1][c])&&board[1][c].equals(board[2][c])){
                System.out.println("player 2 win");
                break;}
            else if(board[r][0].equals(board[r][1])&&board[r][1].equals(board[r][2])){
                System.out.println("player 2 win");
                break;}
            else if(board[0][0].equals(board[1][1])&&board[1][1].equals(board[2][2])&&board[2][2].equals("X")){
                System.out.println("player 2 win");
                break;}
            else if(board[0][2].equals(board[1][1])&&board[1][1].equals(board[2][0])&&board[2][0].equals("X")){
                System.out.println("player 2 win");
                break;}
            else
                n++;}
        
    }
    }
    }
    }

