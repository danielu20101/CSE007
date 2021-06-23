/*Daniel Unhuryan
CSE 007
03/18/2021
This program is intended to create a madlib either being asked to make one or creating one*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Madlibs {
    public static void main(String[] args) {
        int count = 0;

        String[]adjectives = {"silly","quick","blue","pale", "yellow", "tall", "short", "handsome", "ugly", "insane", "beautiful", "chaotic", "invincible", "unique", "small"};
        String[]subject = {"mouse", "dog", "cat", "rat", "rat", "aligator","porcupine", "hedghog", "person", "Fireman", "polic officer", "gorilla", "orangatang", "lawyer", "doctor"}; //All four of these arrays are either objects, adjectives, verb, or subjects.
        String[]verb = {"ate", "flipped", "flew", "swam", "destroyed", "ran", "banned", "flattered", "scared", "marred", "broke", "sang", "blew", "dodged", "ignored" };
        String[]object = {"pineapple", "spongebob", "krabby patty", "boat", "food", "van","tree","ocean","plane", "road", "weapon", "banana", "bed", "lamp", "door-frame", "swimming pool", "guinea pig"};

        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);

        while(count < 1){ //This is the input validation using the count variable
            System.out.println("Do you want to create your own madlib? (Y or N -- anything else to quit):"); 
            if(count == 0){
            String decision = scnr.next();
            if (!decision.toUpperCase().equals("Y") && !decision.toUpperCase().equals("N")){
                System.out.println("You have quit the program");
                count+=1;
            }else if(decision.toUpperCase().equals("N")){
                int[] madlibnumbers = new int[6];
                for(int i = 0; i < 6; i++){
                    madlibnumbers[i] = Math.abs(rand.nextInt() % 15);
                    count+=1;
                    }
                //System.out.println(Arrays.toString(madlibnumbers)); I commented this out for the aesthetics. It just prints the indices
                
                System.out.println("Your madlib: The " + adjectives[madlibnumbers[0]] + " " + adjectives[madlibnumbers[1]] + " " + subject[madlibnumbers[2]] + " " + verb[madlibnumbers[3]] + " the " + adjectives[madlibnumbers[4]] + " " + object[madlibnumbers[5]]); //This is the madlib that prints out if the user says no.    
            }else if(decision.toUpperCase().equals("Y")){
                System.out.print("Please enter an adjective: "); //All the print statements here ask the user for input
                String adjective1 = scnr.next();
                System.out.print("Please enter another adjective: ");
                String adjective2 = scnr.next();
                System.out.print("Enter a subject: ");
                String subject1 = scnr.next();
                System.out.print("Please enter a past tense verb: ");
                String verb2 = scnr.next();
                System.out.print("Enter another adjective: ");
                String adjective3 = scnr.next();
                System.out.print("Enter an object: ");
                String object2 = scnr.next();
                System.out.print("Your madlib: The " + adjective1 + " " + adjective2 + " " + subject1 + " " + verb2 + " the " + adjective3 + " " + object2);
                System.out.println();
                break;
            }
            }
                
            }
        }
    }

