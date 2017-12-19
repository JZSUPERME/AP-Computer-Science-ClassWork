/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionfrombook_stevenjin;
import java.util.Scanner;

/**
 *
 * @author JZSUPERME
 */
public class RecursionFromBook_StevenJin {

    public static void stackWords() {
        Scanner input= new Scanner(System.in);
        String word = input.nextLine(); 
        if (word.equals("."))
            System.out.println();
        else
            stackWords(); 
            System.out.println(word);
}
    public static void main(String args[]) {

        System.out.println("Enter list of words, one per line."); 
        System.out.println("Final word should be a period (.)"); 
        stackWords();
    }
    
}
