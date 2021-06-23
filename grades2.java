/*Daniel Unhuryan
CSE 007
03/25/21
This program is meant to search through a list of randomly created grades and determine if that grade exists in the list. The list is random
and we will use binary search to find the character in the list.*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class grades2 {
    public static void main(String[] args) {
        int count = 0;
        int numberofintegers = 0; 
        Scanner scnr = new Scanner(System.in);

        while(count < 1){ //Input validation for the number of letters
            System.out.println("Please enter a number representing the number of students enrolled in CSE 007");
            numberofintegers = scnr.nextInt();
            //check if an integer
            if (numberofintegers == (int)numberofintegers){
                //check if its not in the right range
                if(numberofintegers < 5 || numberofintegers > 150){
                    System.out.println("Value must be between 5 and 150");
                }
                else{
                    //adjust count to break the while loop
                    count = 1;
                }
            }
            else{
                System.out.println("Please enter an integer");
            }
        }

        Random rand = new Random();
        int[] array = new int[numberofintegers];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*99);
       }
       System.out.println(Arrays.toString(array)); //This code will display the array in normal order

        //$$ sort the array
       int temp = 0 ;
       for (int i = 0; i < array.length; i++) {     //This code will display the array in descending order
        for (int j = i+1; j < array.length; j++) {     
           if(array[i] < array[j]) {    
               temp = array[i];    
               array[i] = array[j];    
               array[j] = temp;    
           }     
        }     
    }
    System.out.println("Elements of array sorted in descending order: ");    
    
    System.out.println(Arrays.toString(array));

       int currentElement;//INSERTION SORT STARTS HERE
       for(int i = 1; i < array.length; i++){  /*I chose insertion sort because there is not a lot of data to handle.*/ 
           currentElement=array[i];
           int j = i - 1;
           for(; j >= 0 && array[j]> currentElement; j--){
               array[j+1] = array[j];
           }
           array[j+1] = currentElement;//INSERTION SORT ENDS HERE
        }
           double total = 0;
           for(int i=0; i < array.length; i++){
        	total = total + array[i];
        }
        double average = total / array.length;
        System.out.printf("The average grade for the class is: %.3f", average); //need to print to 3 decimal spaces
        System.out.println("");
        
        count = 0;
        while(count < 1){ //Input validation for whether the person enters a letter or a number
            System.out.println("Please enter a number representing the grade/grade range you would like to search for");
            int grade = 7767;
            String gradeLetter = scnr.next();
            try{
            grade = Integer.parseInt(gradeLetter);
            }
            catch(NumberFormatException e){
            }
            //check if interger
            if((int)grade == grade && grade != 7767){
                if( grade <= 100 && grade >= 0){
                    count = 1;
                    int found = 0;
                    for (int i =0; i<array.length; i++){
                        if(array[i] == grade){
                            System.out.println("We found this grade on the " + i + "th element");
                            found = 1;
                            break;
                        }
                    }                
                    if(found == 0){
                        System.out.println("We couldnt find this grade");
                    } 
                }
                else{
                    System.out.println("Enter a number between 0 and 100");
                }
            }
            else{               
                if(gradeLetter.equals("A") || gradeLetter.equals("B") || gradeLetter.equals("C") || gradeLetter.equals("D") || gradeLetter.equals("F")){
                    int gradeCount = 0;
                    count = 1;
                    for (int i =0; i<array.length; i++){
                        if(array[i]>=90 && gradeLetter.equals("A")){
                            gradeCount++;
                        } else if(array[i]>=80 && array[i]<90 && gradeLetter.equals("B")){
                            gradeCount++;
                        } else if(array[i]>=70 && array[i]<80 && gradeLetter.equals("C")){
                            gradeCount++;
                        } else if(array[i]>=60 && array[i]<70 && gradeLetter.equals("D")){
                            gradeCount++;
                        } else if(array[i]<60 && gradeLetter.equals("F")){
                            gradeCount++;
                        }
                    }
                    System.out.println("We counted " + gradeCount + " grades of " + gradeLetter);
                }
                else{
                    System.out.println("Enter a capitalized letter grade");//The user did not enter the correct letter
                }
            }  
    }
}
}