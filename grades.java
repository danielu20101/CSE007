/*Daniel Unhuryan
CSE 007
03/25/21
This program is made to practice sorting arrays using binary and manipulating arrays. 
We will use binary search to find grades in a CSE class.*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class grades {
    public static void main(String[] args) {
        int count = 0;
        int numberofintegers = 0; 
        Scanner scnr = new Scanner(System.in);

        while(count < 1){ //Input validation for the number of students in CSE 007
            if (count == 0){
            System.out.println("Please enter a number representing the number of students enrolled in CSE 007");
            numberofintegers = scnr.nextInt();
            if (scnr.hasNextInt() == true){
                if(numberofintegers < 150 && numberofintegers > 5){
                    count = 1;
                }else{
                    System.out.println("Please enter a value in the range 5-150");
                    }
                }else if(scnr.hasNextInt() == false){
                    System.out.println("You have entered an improper value, please enter a number greater than 10");
                    scnr.nextLine(); //clears the scanner and goes back to what it was in the beginning of the loop
                    }
            }
        }

        Random rand = new Random();
        int[] array = new int[numberofintegers];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*99);
       }
       System.out.println(Arrays.toString(array)); //This code will display the array in normal order


       int temp = 0 ;
       for (int i = 0; i < array.length; i++) {     //This code will display the array in descending order
        for (int j = i+1; j < array.length; j++) {     /*This is insertion sort but simplified, and I
            chose this method of sorting because the time complexity should not interfere with the sorting of the computer. 
            Simply, this code is easy to understand, and it will not take that much time to compute using this method.*/
           if(array[i] > array[j]) {    
               temp = array[i];    
               array[i] = array[j];    
               array[j] = temp;    
           }     
        }     
    }
    System.out.println("Elements of array sorted in descending order: "); 
    System.out.print(Arrays.toString(array));//prints the array in descending order

        double total = 0;
        for(int i=0; i < array.length; i++){
        total = total + array[i];
    }
        double average = total / array.length;
        System.out.println("The average grade for the class is: " + //prints the average of the grades to 3 decimal spaces
        String.format("%.3f", average)); 

        System.out.println("Please enter a number representing the grade/grade range you would like to search for");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        while(count < 1){ //Input validation for whether the person enters a LETTER or a NUMBER
            int grade = scnr.nextInt();
            if (count == 0){
            //scnr.nextInt();  //I forgot why we do not include this
            if(scnr.hasNextInt()){
                if(grade < 100 && grade > 0){
                    int keyIndex = -1; //setting keyIndex to -1 so that if it is found it will be changed to something when it is found
                    int mid, low, high;
                    low = 0;
                    high = array.length-1;
                    while(high>=low) {
                        mid = (array.length/2);
                        if (array[mid] < grade){//what is key supposed to be here
                            low = mid+1;
                        } else if(array[mid] > grade) {
                            high = mid-1;
                        } else {
                            keyIndex = mid;
                            break;
                        }
                    }
                    if(keyIndex!=-1){
                        System.out.println(grade + "was found at index=" + keyIndex);
                    }else{
                        System.out.println(grade+ "was not found in the array of numbers");
                    }
                    count+=1;
                    break;
                }else if(scnr.hasNext()){
                        for (int i =0; i<array.length; i++){
                            if(scnr.next().equals('A') && array[i]>=90 && array[i]<100){
                                a = a+1;
                                System.out.println("The number of A's in the class is: " + a);
                            } else if(scnr.next().equals('B') && array[i]>=80 && array[i]<90){
                                b = b+1;
                                System.out.println("The number of B's in the class is: " + b);
                            } else if(scnr.next().equals('C') && array[i]>=70 && array[i]<80){
                                c = c+1;
                                System.out.println("The number of C's in the class is: " + c);
                            } else if(scnr.next().equals('D') && array[i]>=60 && array[i]<70){
                                d = d+1;
                                System.out.println("The number of D's in the class is: " + d);
                            } else if(scnr.next().equals('F') && array[i]<60){
                                f = f+1;
                                System.out.println("The number of F's in the class is: " + f);
                            }
                        }
                }else{
                    System.out.println("You have entered an improper value, please enter a number greater than 0 and less than 100 or a Letter A,B,C,D,F");
                    scnr.nextLine(); //clears the scanner and goes back to what it was in the beginning of the loop
                }
            }
        }

    }
}
}
