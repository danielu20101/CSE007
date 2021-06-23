import java.util.Scanner;

public class VWMenuStart{
    public static void main(String[] args) {
        int choice;
        double balance = 100;
        String[] friendsList = new String[25];
        double[][] transactions = new double[25][2]; // column 0 is moneySent; column 1 is moneyReceived
        int currentIndexFriends = 0;
        do {
            printMenu();
            choice = getInt();
            switch (choice) {
                case 1:
                    currentIndexFriends = addFriend(friendsList, currentIndexFriends);
                    break;
                case 2:
                    searchFriend(friendsList,currentIndexFriends);
                    break;
                case 3:
                    displayFriends(friendsList, currentIndexFriends);
                    break;
                case 4:
                    //displayBalance(balance);
                    //balance = sendMoney(balance, friendsList, transactions);
                    break;
                case 5:
                    //balance = requestMoney(balance, friendsList, transactions);
                    break;
                case 6:
                    //displayBalance(balance);
                    break;
                case 7:
                    System.out.println("Goodbye");
                    break;
            }
        } while (choice != 7);
    }

    /*
     * Method: PrintMenu 
     * Precondition: none Postcondition: menu options will be
     * displayed for the user
     */
    public static void printMenu() {
        System.out.println("VW Main Menu");
        System.out.println("1. Add Friends");
        System.out.println("2. Search Friend");
        System.out.println("3. View Friends");
        System.out.println("4. Send Money");
        System.out.println("5. Request Money");
        System.out.println("6. Check Balance");
        System.out.println("7. Quit");
    }
 
    /*
     * Method: getInt() 
     * Precondition: none 
     * Postcondition: validate integer input
     * from user before returning that input
     */
    public static int getInt() {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt() == false) {
            System.out.println("You entered and invalid value -- try again");
            input.nextLine();// clear buffer
        }
        int num = input.nextInt();
        return num;
    }
    /*
     * Method: getDouble() 
     * Precondition: none 
     * Postcondition: validate positive double input from user before returning that input
     */
    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        double x;
        do {
            if (input.hasNextDouble()) {
                x = input.nextDouble();
                if (x <= 0) {
                    System.out.println("You entered and invalid value -- try again");
                    continue;
                } else {
                    return x;
                }
            } else {
                System.out.println("You entered and invalid value -- try again");
                String junk = input.nextLine();
            }
        } while (true);
    }
    /**** Method: getString()
     * precondition: none
     * post condition:read in a string from user
     */
    public static String getString(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


    displayBalance(getDouble());

    public static double displayBalance(double balance){
    balance = 26.89;
    System.out.println("Your current balance is: " + balance);
    return balance;
    }

     /*Method: displayBalance() 
     * Precondition: some double value representing the current balance of the user will be passed in as an arg 
     * Postcondition: The current balance will be displayed, but it will not change.
     */
    

    public static double sendMoney(double MoneyToSend){
     
    }   /* Method: sendMoney() 
     * Precondition: you will pass in the current balance, and
     * references to friendsList and transactions, all of which may or may not have
     * changed 
     * Postcondition: The amount of money requested to send (which cannot be
     * greater than the current balance) will be sent to the friend indicated; if
     * the friend wasn't in the list, she'll be added (but that is another method)
     */
    
    /*
     * Method: requestMoney() 
     * Precondition: you will pass in the current balance, and
     * references to friendsList and transactions, all of which may or may not have
     * changed 
     * Postcondition: The amount of money to request from a friend will be processed; if the friend isn't 
     * currently in the list, she'll be added (in another method). 
     */
    
    /*      
     * Method: searchFriends()
     * Precondition: you will pass in the reference to the friendsList
     * Postcondition: after getting the name of a friend to search for, this program will use linear search and indicate if the friend was found or not. 
     */
    public static void searchFriend(String[] friendsList, int len) {
        
        if(len != 0){
            System.out.println("Who do you want to search for?");
            String name = getString();
            
            for(int i = 0; i<len; i++){
                if(friendsList[i].equals(name)){
                    System.out.println(name + " was found in your list");
                    return;
                } 
            }
            System.out.println(name + " was not found in your list");}
        else{
            System.out.println("Your friendsList is empty");
        }
    }
    /*      
     * Method: displayFriends()
     * Precondition: you will pass in the reference to the friendsList
     * Postcondition: only the filled portion of the friendsList will be printed (no transaction data).
     */
    public static void displayFriends(String[] friendsList,  int numFriends) {
        if (numFriends == 0) {
            System.out.println("You haven't added any friends yet!");
        } else {
            for (int i = 0; i < numFriends; i++) {
                System.out.println("Name:" + friendsList[i]);
            }        
        }
    }
    /*      
     * Method: addFriend())
     * Precondition: you will pass in the reference to the friendsList, giving the user access to directly add a friend
     * Postcondition: after checking to make sure that the list isn't full, you will add the user to the next available element and return the incremented index     */
    public static int addFriend(String[] friendsList, int friendIndex) {
        Scanner in = new Scanner(System.in);
        System.out.println("Who do you want to add to your friends list?");
        String name = getString();
        if (friendIndex == friendsList.length){
            System.out.println("Your friendsList is full");
            return friendsList.length;
        }
        else {
            friendsList[friendIndex++] = name; 
            return friendIndex;
        }
    }

}
