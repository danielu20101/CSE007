/*Daniel Unhuryan
CSE 007
03/22/21
The purpose of this program is to practice creating arrays and converting them from char to string. 
it will check the number of occurrances of letters from the alphabet in the input which is converted to an array called array*/

import java.util.Scanner;
import java.util.Arrays;

public class CharCounts {
    public static void main(String[] args) {
        System.out.println("Please enter the word you would like to check occurances of letters");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine().toLowerCase(); //this will prompt the user to enter the word which will be a string
        int numofchar = input.length();//this line is used to figure out the length of the input using .length() method
        
        char[] array = new char[numofchar];//Part of the process of converting the string to the character array, so I must make an 
        //"array" that has the number of indices as numofchar, which is the length of the input

        for(int i = 0; i < numofchar; i++){ //this for loop loops through the input and assigns each character based on the index, i. 
            array[i] = input.charAt(i); //lets take the input, bat, for example. index 0 is b, index 1 is a, index 2 is t
        }
        System.out.println(Arrays.toString(array));//I don't have to print this but it will be clearer what is going on.
       
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();//translates the string alphabet into the character array
        int[] counts = new int[alphabet.length]; //array that will be used to hold the number of occurances of alphabet

        for(int i = 0; i < array.length; i++){ //this code tracks the number of occurances of the letters in the alphabet in the scanned word
            for (int j = 0; j < 26; j++){//j should be initialized to 0, not 1, a is being skipped over

                if(array[i]==alphabet[j]){//if the letter in the alphabet is equal to the input array, if it is, than counts is incremented by one
                    counts[j]+=1;//the code that increments count array ends here, so now the counts array holds the input increments.
                }
            }
        } 
        System.out.println(Arrays.toString(counts)); //this will print every occurance of letter in the array

        int temp = 0 ;
        char temp1;
        for (int i = 0; i < counts.length; i++) {     //This code will display the array,counts, in descending order
         for (int j = i+1; j < counts.length; j++) {  
            //This is insertion sort, simplified version

            if(counts[i] < counts[j]) {  

                temp = counts[i];
                counts[i] = counts[j];    
                counts[j] = temp;

                temp1 = alphabet[i];
                alphabet[i] = alphabet[j];
                alphabet[j] = temp1;
                
            }     
         }     
     }

     System.out.println(Arrays.toString(counts));

    System.out.println(Arrays.toString(alphabet));
     //At this point, counts is being displayed in descending order, but we need this to be implemented to "the alphabet array" at the same time.
    System.out.println("The toal number of unique characters in your list is: " + array.length);
    System.out.println("The total number of occurrences of each unique letter is: " + array.length);
    }
}
