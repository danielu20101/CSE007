import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SortREverse1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int rows;
        int columns = 0; 
        boolean trigger = true; //this trigger is used to control how many times the input validation works.
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //this is the array made which will be used to get random lettes from

        do{System.out.println("Please Enter a number (2-10) for the number of rows of your array: "); 
            rows = scnr.nextInt();
            if (rows >= 2 || rows <=10){//if the number is in range
                trigger = false; //the trigger here will cancel, and the values are going to be stored
            }
            if (rows < 2 || rows > 10){
                System.out.println("The input is invalid");
                trigger = true; //if it is out of range, then we will continue prompting making sure we get the right input
            }
        }while(trigger);
        do{System.out.println("Please enter a number (2-10) for the number of columns of your array: ");
        columns = scnr.nextInt();
        if (columns >= 2 || columns <= 10){
            trigger = false;
        } 
        if (columns < 2 || columns >10){
            System.out.println("Your input is invalid");
            trigger = true;
        }
    }while(trigger);
    char [][] mycharacterArray = new char[rows][columns];
    for (rows = 0; rows<mycharacterArray.length; rows++){
        for (columns = 0; columns < mycharacterArray[rows].length; columns++){
            mycharacterArray[rows][columns] = getRandomLetter();
            System.out.println(mycharacterArray[rows][columns]);
        }
    }
    print2Darray(mycharacterArray);
    for(int i =0; i < mycharacterArray.length; i++){
        sort(mycharacterArray[i]);
    }
    print2Darray(mycharacterArray);
}public static char getRandomLetter(){
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    int randomIndex = (int) (Math.random()*alphabet.length);
    return alphabet[randomIndex];
}
public static void sort(char [] mycharacterArray){
    for (int i = 1; i < mycharacterArray.length; i++) {     //start at the second element
        for (int j = 0; j < i; j++) {    //we are looking for greater elements than the one that we are looking at

           if(mycharacterArray[i] < mycharacterArray[j]) { //I used insertion sort, but a simplified version for this array  
               char temp = mycharacterArray[i];        //Insertion here will look for the values and determine between 2 values the correct position 
               shift(mycharacterArray, j, i-1);   
               mycharacterArray[j] = temp;  
               //array in ascending order  
           }     
        }     
    }
}
public static void print2Darray(char [][] arr){
for(int i = 0; i < arr.length; i++){
    System.out.println(Arrays.toString(arr[i]));
}
System.out.println();
}
public static void shift(char [] array, int startOfShift, int endOfShift){
if(endOfShift>=array.length-1){
    return;
}
for(int i = endOfShift; i >= startOfShift && i>=0; i--){
    array[i+1]=array[i];
}
}
//the array in descending order by reversing the array in ascending order, which needs to be a void method
public static void reverseVals(int[] mycharacterArray) {
        int i;             // Loop index
        int tempValue;
  
        for (i = 0; i < (mycharacterArray.length / 2); ++i) { //this is the reverse method for the character array, which should be called in the function
           tempValue = mycharacterArray[i]; // Do swap
           mycharacterArray[i] = mycharacterArray[mycharacterArray.length - 1 - i];
           mycharacterArray[mycharacterArray.length - 1 - i] = tempValue;
        }
     }
}
