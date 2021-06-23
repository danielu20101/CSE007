import java.util.Scanner;
public class VW3{
  public static void main(String [] args){
   
    double currBal = 152.34; //this is the starting balance of your venmo account
    
    //So far, the program simply prints out the menu options. What else needs to happen here?
      System.out.println("Venmo Main Menu");        
      System.out.println("S: Send Money");         //If the user types S, what should the program do?
      System.out.println("R: Request Money");      //If the user types R, what should the program do?
      System.out.println("B: Check Balance");     //If the user types B, what should the program do?
      System.out.println("Q: Quit");              //If the user types Q, what should the program do?

      char S;
      char R;
      char B;
      char Q;
      Double newcurrbal;
      String message2;
      String message;

      Scanner input = new Scanner(System.in);
      char selection = input.next().charAt(0);
      
      switch (selection) {
          case 'S':   message = "Who would you like to send money to?";
          String name1 = input.next();
          message2 = ("How much would you like to send to" + name1);
          Double amounttosend = input.nextDouble();
          if (amounttosend > currBal) {
              System.out.println("Error");
          }else{
            newcurrbal = (currBal - amounttosend);
            System.out.printf("Success! Your new balance is: %.2f",newcurrbal);
          }
                    break;
          case 'R':   message = "Who would you like to request money from?";
                    break;
          case 'B':   message = "Your current balance is: ";
                    break;
          case 'Q':   message = "Venmo Main Menus";
                    break;
          default:    message = "Error";
                    break;

      }
      System.out.println('S');
    }
}
    