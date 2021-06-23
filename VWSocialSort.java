import java.util.Scanner;
import java.util.Arrays;

public class VWSocialSort{
    public static void main(String[]args){
        int menuChoice = 4; //choices defined below and in description
        String[] friendsList = new String[25]; //VW creates FriendsList of length 25 by default
        int currentListIndex = 0; //this integer will hold the index of the next available (empty) element to add a friend
        int num;
        Scanner scnr = new Scanner(System.in);
        do{ 
            System.out.println("VW Social Menu");
            System.out.println("1. View Friends"); 
            System.out.println("2. Add Friends");
            System.out.println("3. Search Friends"); 
            System.out.println("4. Quit");

            do{
                boolean correct = scnr.hasNextInt();
                if(correct && scnr.nextInt() < 4 && scnr.nextInt() >= 1){
                    num = scnr.nextInt();
                    break;
                }else {
                    System.out.println("Your input is an invlaid choice");
                    scnr.next(); //Clears scanner and asks user for input again here.
                }
            }while(true);

            if(num == 1){
                if (currentListIndex == 0){ //why is it currentlistInex and not friendslist.length
                    System.out.println("You currently have no friends added.");
                }
                else{
                    for(int i = 0; i<friendsList.length; i++){
                        System.out.println(friendsList[i]);
                    }
                } 
            }else if(num == 2){
                //assinging current list index with the friend we enter in the scanner
                if (currentListIndex < friendsList.length){ //why is it if currentListIndex < friendslist.length??????
                    System.out.println("Enter the name of the friend you would like to add");
                    friendsList[currentListIndex++] = scnr.next();
                } else{
                    System.out.println("Your friends list is full");
                } break;
            }else if(num == 3){
                if(currentListIndex==0){
                    System.out.println("There are no friends in your friends list");
                }else{
                    System.out.println("Please enter the name of your friend you would like to search for");
                    String name = scnr.nextLine();
                    
                    //INSERTION SORT STARTS HERE
                    //compareTo() return 0 if equal, return -1 if first is less than, return 1 if first is greater than
                    for(int i=1; i < friendsList.length; i++){
                        name = friendsList[i];
                        int j = i-1;
                        for(;j >= 0 && friendsList[j].compareTo(name) > 0; j--){
                            friendsList[j+1] = friendsList[j];
                        }
                        friendsList[j+1] = name;
                    } //INSERTION SORT ENDS HERE

                    System.out.println(Arrays.toString(friendsList));
                    int keyIndex = -1; //setting keyIndex to -1 so that if it is found it will be changed to something when it is found
                    int low = 0;
                    int high = friendsList.length-1;
                    while(high>=low) {
                        int mid = (int) (friendsList.length/2);
                        if (friendsList[mid].compareTo(name) > 0){//what is key supposed to be here
                            low = mid+1;
                        } else if(friendsList[mid].compareTo(name) < 0){
                            high = mid-1;
                        } else{
                            keyIndex = mid;
                            break;
                        }
                        for(int i = 0; i < friendsList.length; i++){
                        if(name.equals(friendsList[i])){
                            System.out.println("This friend is in your friends list");
                        }else{
                            System.out.println("This friend is not in your list");
                            }
                        }
                    }
                }
            }else if (num == 4){
                    System.out.println("Goodbye");
                    break;
                }  
        } while(menuChoice != 4);

    }
}
