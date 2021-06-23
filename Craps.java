/*Daniel Unhuryan
CSE 007 
February 23, 2021
This code is intended to roll two pairs of dice, ask the user if they want to roll or
if the computer should generate the numbers, and output a result*/


import java.util.Scanner;
import java.util.Random;

public class Craps {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Hi, would you like to roll two dice or enter two dice values?");//ask the user if they want to roll or generate
        String decision = scnr.nextLine();
        
        if (decision.equals("roll two dice")){//if the user inputs to roll the dice, do this
            Random number1 = new Random();
            int roll1 = number1.nextInt(5) + 1;//these call an object, and modify them to create numbers 1-6

            Random number2 = new Random();
            int roll2 = number2.nextInt(5) + 1;//these call an object, and modify them to create numbers 1-6
            System.out.println("Your two dice values are "+ roll1+ " and " + roll2);
            switch(roll1){//comparing the second roll to the first roll which is assigned int values with each case
                case(1): {
                    if (roll2 == 1 && roll1==1)  //each case compares the second roll with the first, and then prints the combination name
                    System.out.println("Your combination is snake eyes");
                    else if(roll2 == 2 && roll1==1)
                    System.out.println("Your combination is Ace Deuce");
                    else if(roll2 == 3 && roll1==1)
                    System.out.println("Your combination is Easy Four");
                    else if(roll2 == 4 && roll1==1)
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 5 && roll1==1)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 6 && roll1==1)
                    System.out.println("Your combination is Seven Out");}
                case(2): { 
                    if (roll2 == 1 && roll1==2)  
                    System.out.println("Your combination is Ace Deuce");
                    else if(roll2 == 2 && roll1==2)
                    System.out.println("Your combination is Hard Four");
                    else if(roll2 == 3 && roll1==2)
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 4 && roll1==2)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 5 && roll1==2)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 6 && roll1==2)
                    System.out.println("Your combination is Easy Eight");}
                case(3): {
                    if (roll2 == 1 && roll1==3)  
                    System.out.println("Your combination is Hard Four");
                    else if(roll2 == 2 && roll1==3)
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 3 && roll1==3)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 4 && roll1==3)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 5 && roll1==3)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 6 && roll1==3)
                    System.out.println("Your combination is Nine");}
                case(4): {
                    if (roll2 == 1 && roll1==4)  
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 2 && roll1==4)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 3 && roll1==4)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 4 && roll1==4)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 5 && roll1==4)
                    System.out.println("Your combination is Nine");
                    else if(roll2 == 6 && roll1==4)
                    System.out.println("Your combination is Easy Ten");}
                case(5): {
                    if (roll2 == 1 && roll1==5)  
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 2 && roll1==5)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 3 && roll1==5)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 4 && roll1==5)
                    System.out.println("Your combination is Nine");
                    else if(roll2 == 5 && roll1==5)
                    System.out.println("Your combination is Easy Ten");
                    else if(roll2 == 6 && roll1==5)
                    System.out.println("Your combination is Yo-leven");}
                case(6): {
                    if (roll2 == 1 && roll1==6)  
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 2 && roll1==6)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 3 && roll1==6)
                    System.out.println("Your combination is Nine");
                    else if(roll2 == 4 && roll1==6)
                    System.out.println("Your combination is Easy Ten");
                    else if(roll2 == 5 && roll1==6)
                    System.out.println("Your combination is Yo-leven");
                    else if(roll2 == 6 && roll1==6)
                    System.out.println("Your combination is Boxcards");
                   
                }
            }
        }
         else if (decision.equals("enter two dice values")){//if the user decides to enter his own values
            System.out.println("Please enter the first roll");//asks for first roll
            int roll1 = scnr.nextInt();//input the first roll
            System.out.println("Please enter the second roll");//asks for second roll
            int roll2 = scnr.nextInt();//input the second roll
            switch(roll1){//compares the roll1 assigned an int with each case to the second roll
                case(1): {
                    if (roll2 == 1 && roll1==1)  
                    System.out.println("Your combination is snake eyes");
                    else if(roll2 == 2 && roll1==1)
                    System.out.println("Your combination is Ace Deuce");
                    else if(roll2 == 3 && roll1==1)
                    System.out.println("Your combination is Easy Four");
                    else if(roll2 == 4 && roll1==1)
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 5 && roll1==1)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 6 && roll1==1)
                    System.out.println("Your combination is Seven Out");}
                case(2): { 
                    if (roll2 == 1 && roll1==2)  
                    System.out.println("Your combination is Ace Deuce");
                    else if(roll2 == 2 && roll1==2)
                    System.out.println("Your combination is Hard Four");
                    else if(roll2 == 3 && roll1==2)
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 4 && roll1==2)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 5 && roll1==2)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 6 && roll1==2)
                    System.out.println("Your combination is Easy Eight");}
                case(3): {
                    if (roll2 == 1 && roll1==3)  
                    System.out.println("Your combination is Hard Four");
                    else if(roll2 == 2 && roll1==3)
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 3 && roll1==3)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 4 && roll1==3)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 5 && roll1==3)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 6 && roll1==3)
                    System.out.println("Your combination is Nine");}
                case(4): {
                    if (roll2 == 1 && roll1==4)  
                    System.out.println("Your combination is Fever Five");
                    else if(roll2 == 2 && roll1==4)
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 3 && roll1==4)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 4 && roll1==4)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 5 && roll1==4)
                    System.out.println("Your combination is Nine");
                    else if(roll2 == 6 && roll1==4)
                    System.out.println("Your combination is Easy Ten");}
                case(5): {
                    if (roll2 == 1 && roll1==5)  
                    System.out.println("Your combination is Easy Six");
                    else if(roll2 == 2 && roll1==5)
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 3 && roll1==5)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 4 && roll1==5)
                    System.out.println("Your combination is Nine");
                    else if(roll2 == 5 && roll1==5)
                    System.out.println("Your combination is Easy Ten");
                    else if(roll2 == 6 && roll1==5)
                    System.out.println("Your combination is Yo-leven");}
                case(6): {
                    if (roll2 == 1 && roll1==6)  
                    System.out.println("Your combination is Seven Out");
                    else if(roll2 == 2 && roll1==6)
                    System.out.println("Your combination is Easy Eight");
                    else if(roll2 == 3 && roll1==6)
                    System.out.println("Your combination is Nine");
                    else if(roll2 == 4 && roll1==6)
                    System.out.println("Your combination is Easy Ten");
                    else if(roll2 == 5 && roll1==6)
                    System.out.println("Your combination is Yo-leven");
                    else if(roll2 == 6 && roll1==6)
                    System.out.println("Your combination is Boxcards");
                   
        }

    }
}
}
}