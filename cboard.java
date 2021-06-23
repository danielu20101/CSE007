class cboard { 

    private String[] boardSquares; //contains the marks of each player in their appropriate indexed positions 
    private final int numSquares = 9;//a tic tac toe board will always have 9 squares. 
    private final String empty = " ";

    public cboard() {
        initboardSquares();
    }

    public void printBoard() {//prints a tic tac toe board
        System.out.print(this.toString());
    }
    public boolean isFull() {
        for (int i = 0; i < numSquares; i++) {
            if (boardSquares[i].equals(empty)) return false;
        }
        return true;
    }
    public String toString() {
        int[] pos = {16,20,24,30,34,38,44,48,52};//positions of "squares"
        StringBuilder s = new StringBuilder(    "*************\n"
                                            +   "*_ _|_ _|_ _*\n"
                                            +   "*_ _|_ _|_ _*\n"
                                            +   "*   |   |   *\n"
                                            +   "*************\n");
        for (int i = 0; i < this.numSquares; i++) {
            s.replace(pos[i], pos[i]+1, this.boardSquares[i]);   //replace the character at each square position with the mark at that index
        }
        return s.toString();
    }
    public void changePosition(String pos, String play) {
        try {
            this.boardSquares[Integer.parseInt(pos)] = play; //assume that pos is validated already and set that to input string
        }
        catch (Exception e) {
            System.out.println("pos passed into changePosition was not a valid index");
        }
    }
    
    public boolean checkWin() {
        String[] wins = {"012","345","678","036","147","258","048","246"};
        for (int c = 0; c < wins.length; c++) {
            int i = Integer.parseInt(wins[c].substring(0,1));
            int j = Integer.parseInt(wins[c].substring(1,2));
            int k = Integer.parseInt(wins[c].substring(2));
            if (this.boardSquares[i].equals(this.boardSquares[j]) && this.boardSquares[j].equals(this.boardSquares[k])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSpace(String pos) { //want to determine if player can put something there 

        //let us assume that this method will be used to validate input, therefore this method shall simply 
        //return true/false if it is a space. does not call for new input.
        try {
            int indx = Integer.parseInt(pos);
            if ( (indx <= 9) && (indx >= 1) ) { //then its valid position
                if (this.boardSquares[indx-1].equals(empty)) {//check to see if that square is empty.
                    return true;//index was valid and square was empty. its a space! confirmed! :)
                }
            }
            else  return false; //then position is invalid.. so nope not a space
        }
        catch(Exception e) { // bad input
            return false; 
        }
        return true;
    }

    private void initboardSquares() {
        String[] s = new String[numSquares];//declare
        for (int i = 0; i < s.length; i++) s[i] = empty;//fill array with emptiess
        this.boardSquares = s; //set board squares to this new array
    }
}
