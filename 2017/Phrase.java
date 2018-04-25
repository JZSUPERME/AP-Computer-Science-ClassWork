/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrase;

public class Phrase{

    private String currentPhrase;
    public Phrase(String p){ 
        currentPhrase = p; 
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
    * returns -1 if the nth occurrence does not exist.
    * Precondition: str.length() > 0 and n > 0
    * Postcondition: the current phrase is not modified.
    */
    public int findNthOccurrence(String str, int n){ 
        /* implementation not shown */ 
    }
        
    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
    * If the nth occurrence does not exist, the current phrase is unchanged.
    * Precondition: str.length() > 0 and n > 0 */
    
    public void replaceNthOccurrence(String str, int n, String repl){ 
        int index = findNthOccurrence(str, n);
        if(index != -1){    
            currentPhrase = currentPhrase.substring(0, index) + repl +currentPhrase.substring(index + str.length());
        }
    }
       
    /** Returns the index of the last occurrence of str in the current phrase;
    * returns -1 if str is not found.
    * Precondition: str.length() > 0
    * Postcondition: the current phrase is not modified.
    */
    
    public int findLastOccurrence(String str){ 
        int i = 1;
        int index = -1;
        int nextIndex = findNthOccurrence(str, i);
        
        while(nextIndex != -1){
            index = nextIndex;
            i++;
            nextIndex = findNthOccurrence(str, i);
        }

        return index;
    }
    
    /** Returns a string containing the current phrase. */ 
    public String toString(){ 
        return currentPhrase; 
    }
}

