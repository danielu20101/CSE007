import java.util.Scanner;
import java.util.Arrays;

public class SortReverse {
    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        boolean trigger;
        System.out.println("Please enter the number of rows (2-10) in your 2D array");
        int rows = scnr.nextint();
        getInt();
        System.out.println("Please enter the size of each row");
        getInt();
        char [][] mycharacterArray = new char[getInt()][];
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < mycharacterArray.length; i++) {     
            System.out.print(mycharacterArray[i] + " "); 
    }
}
    public static int getInt(int size1, int size2) {
        Scanner input = new Scanner(System.in); //need to make this between 2-10
        while (input.hasNextInt() == false) {
            System.out.println("You entered and invalid value -- try again");
            input.nextLine();// clear buffer
        }
        int num = input.nextInt();
        return num;
    }
    public static void helper1(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0; i < mycharacterArray.length; i++){
            //some random digit from the alphabet character array is inserted into the array
            //how do I initialize each element to be a character representing a random lowercase letter?
        }
    }
    public static void helper2(){
        for (int i = 0; i < mycharacterArray.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(mycharacterArray[i] < mycharacterArray[j]) {    //I used  
                   temp = mycharacterArray[i];    
                   mycharacterArray[i] = mycharacterArray[j];    
                   mycharacterArray[j] = temp;  
                   //array in ascending order  
               }     
            }     
        }
    }
        //the array in descending order by reversing the array in ascending order, which needs to be a void method
        public static void reverseVals(int[] mycharacterArray) {
            int i;             // Loop index
            int tempValue;
      
            for (i = 0; i < (mycharacterArray.length / 2); ++i) {
               tempValue = mycharacterArray[i]; // Do swap
               mycharacterArray[i] = mycharacterArray[mycharacterArray.length - 1 - i];
               mycharacterArray[mycharacterArray.length - 1 - i] = tempValue;
            }
         }
    }
}


