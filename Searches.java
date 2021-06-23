/*CSE 007
Daniel Unhuryan 
Professor Ziltz
03/18/2020
The purpose of this program is to generate an array, greater than size of 10, with Random letters, and then scan in a letter and 
figure out if that letter is in the randomized array using binary or linaer search*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Searches {
    public static void main(String[] args) {
        int count = 0;
        int count2 = 0;
        String letter;
        int numberofletters = -1;
        char key;
        key = ' ';
        Scanner scnr = new Scanner(System.in);

        while(count < 1){ //Input validation for the number of letters
            System.out.println("Please enter a number greater than 10 representing the length of the array");
            if (count == 0){
            //scnr.nextInt();
            if(scnr.hasNextInt()){
                numberofletters = scnr.nextInt();
                if(numberofletters > 10){
                    int[] letterarray = new int[numberofletters];
                    count+=1;
                    break;
                }else{
                    System.out.println("Please enter a value greater than 10");
                }
            }else if(scnr.hasNextInt() == false){
                System.out.println("You have entered an improper value, please enter a number greater than 10");
                scnr.nextLine(); //clears the scanner and goes back to what it was
            }
        }
    }
    //INPUT VALIDATION ENDS HERE
        while(count2 < 1){ //Input validation for the key value, which schould be a letter
            System.out.println("Please enter a letter which will now represent your key value");
            if (count2 == 0){
            if(scnr.hasNext()){
                letter = scnr.next(); //declare outside of loop 
                if(letter.length() == 1){
                    key = letter.charAt(0);
                    count2+=1;
                    System.out.println(" "); //this will add space so that users can differentiate between their input and the array that will be created.
                    break;
                }else if(letter.length()>1){
                    System.out.println("Please enter a single letter");
                }
            }else{
                System.out.println("You have entered an improper value, please enter a number greater than 10");
                break;
            }
        }
    }//INPUT VALIDATION ENDS HERE
        int rnd = (int) (Math.random() * 52); // math.random to generate the numbers
        char base = (rnd < 26) ? 'A' : 'a';
        System.out.println((char) (base + rnd % 26));
        Random rand = new Random();

        char[] array = new char[numberofletters]; //number of letters is the number greater than 10 which is validated to be greater than 10
        
        for(int i = 0; i < array.length; i++){
            array[i] = (char)(rand.nextInt(26) + 'A');//assigns each index with a random letter between A-Z according to numberofletters, which is the size of the array
       }
       char[] sortedarray = array;
       Arrays.sort(sortedarray);

       for (char element : sortedarray) 
       {
        System.out.println(element);  
       }
       //The array which is made out of random letters with length numberofletters
       int index = -1; 

       for (int i = 0; i < array.length; i++){ //LINEAR SEARCH
           if (array[i] == key){
               index = i;
               break;
           }
       }
       if (index != -1){
           System.out.println(key + " was found at index = " + (index + 1));
       } else {
           System.out.println(key+ " was not found ");
       }

       Arrays.sort(array);/*BINARY SEARCH: I must use a sorted array for binary search
       because I am comparing indices starting from the middle, and if it is sorted, then we can figure out
       if the key is on either the left side or the right side. If the array is not sorted, the purpose of binary search
       becomes useless, because either the left side or the right side is randomized, and the letter can be on either side. */
       int mid, low, high;
       int keyIndex= -1;
       System.out.println("Now we will search for the same key using binary");
       low = 0;
       high= array.length-1;
       while(high >= low){
           mid = (high+low) / 2;
           if (array[mid] < key){
               low = mid+1;
           } else if(array[mid]>key){
               high = mid-1;
           } else {
               keyIndex = mid;   
               break;
           }
       }
       if(keyIndex !=-1) {
           System.out.println(key + " was found at index = " + (keyIndex + 1));
       }else{
           System.out.println(key + " was not found in array");
       }
    }
}