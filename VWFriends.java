import java.util.Scanner;

public class VWFriends {
public static void main(String[] args) {
    int i;
    int count = 0;
    boolean inputFlag = false;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter an integer between 1-10"); //the integer entered here will represent the number of friends
   
    while(!inputFlag){
        int numFriends = scnr.nextInt();
        if(scnr.hasNextInt()){                                                          
            //check the data type of the number
            if(numFriends<0 && numFriends>10){ //check the range, if both checks pass, inputFlag should be set false
                System.out.println("This number of friends is out of range");
                System.out.println("Please try again");
            } else{
                inputFlag = true;  //otherwise, the loop continues bc inputFlag is true
            }
        }   
    }
    String[] Friends = {"John", "Anton", "Miles", "Connor", "Aiden", "Jake", "Caleb", "Elle", "Janet", "Mark"};

    //int transactions = scnr.nextInt();
    int[] transactions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    System.out.println("You completed the most transactions with" + getLargest(transactions,10));

}
}
int buzz [][] = 