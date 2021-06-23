import java.util.Scanner;

class cgame {
    Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        cgame.doCompGame();
    }

    public static void doCompGame() {
        cboard thisGame = new cboard();
        while (!thisGame.checkWin()) {
            doPlayerMove(thisGame);

            //if the game is a win, then the player must have won, since they were the last to move.
            if(thisGame.checkWin()) {
                doEndGame(thisGame);
                break;
            }
            
            doCompMove(thisGame);
            //if the game is a win, then the computer must have won, since they were the last to move.
            if(thisGame.checkWin()) {
                doEndGame(thisGame);
                break;
            }

        }
    }

    //guide a user through making a move
    public static void doPlayerMove(cboard c) {
        String inp = "";
        
        //get input from user
        do { //if input is a space
            System.out.println("Please enter your move (either row column or index of square)");
            inp = scnr.next();
            if (c.checkSpace(inp) ) c.changePosition(inp,"O"); //hard code player's move as O
        } while (!c.checkSpace(inp) ); //do it again if it does not fit the bill
    }
    
    public static void doCompMove(cboard c) {
        if (c.isFull()) {//move not made if the board is full
            doEndGame(c);
            return;
        }

        String r = "";
        do { //if input is a space
            //generate a random number between 1 and 9
            r = Integer.toString( (int) (Math.floor(Math.random()*9+1)) );
            if(c.checkSpace(r)) c.changePosition(r,"X"); //make the move!
        } while (!c.checkSpace(r) ); //do it again if it doesnt fit the bill
    }
    public static void doEndGame(cboard c) {
        
        System.out.println("the game is over!");
        c.printBoard();
    }

}