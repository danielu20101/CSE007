/*Daniel Unhuryan
02/08/21
CSE7 HW1
This program is made to print out the number of quarters and dollars, but needs to be debugged*/

public class Test {
    public static void main(String[] args) {   //moved brackets over one space to the left
        final int DOLLAR = 100, Quarter = 25;  //changed capital F to f 
        double money;   //cannot call a variable with number 1st, changed to money
        int dollars, quarters; //change the comma to a semicolon
        money = 23.68; // used double to declare the money variable
        
        // Processing 
        int amount = (int) (money * 100);
        dollars = amount / DOLLAR; //add semicolon at the end
        amount = amount % DOLLAR; //fixed the two ll to LL
        quarters = amount / Quarter; // QUARTER to Quarter
        
        //Output
        System.out.print("Dollars= " + dollars + " quarters= " + quarters + "\n");
    }
    /*at the system.out.print statement, I added the paranthesis after the space of the = so the string 
    is concatenate with the + and the dollars variable. I assumed the dollars= "variable" will represent the amount
    of dollars and the quarters= will represent the string where the quarters will be added at the end.*/  
    //prints: Dollars= 23 quarters= 2
}
