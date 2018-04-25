package position;

public class Position {
    /** Constructs a Position object with row r and column c. */
    
    public Position(int r, int c)
    { /* implementation not shown */ }
    
    // There may be instance variables, constructors, and methods that are not shown. }
    
    /** Returns the position of num in intArr;
    * returns null if no such element exists in intArr. * Precondition: intArr contains at least one row. */
    public static Position findPosition(int num, int[][] intArr){
        for(int r = 0; r <= intArr.length-1; r++)
            for(int c = 0; c <= intArr[0].length-1; c++)
                if(intArr[r][c] == num)
                return new Position(r, c);

        return null;
   }

    public static Position[][] getSuccessorArray(int[][] intArr){
        Position[][] successors = new Position[intArr.length][intArr[0].length];

        for(int r = 0; r <= successors.length-1; r++)
            for(int c = 0; c <= successors[0].length-1; c++)
                successors[r][c] = findPosition(intArr[r][c] + 1, intArr);

    return successors;
}       
}
