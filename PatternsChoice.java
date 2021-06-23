/*Daniel Unhuryan
CSE 007
This program is made to print the pattern which the user intends to print out.*/


import java.util.Scanner;

public class PatternsChoice {
    public static void main(String[] args) {
        System.out.println("Please enter the choice of pattern you would like(Pattern A, Pattern B, Pattern C, Pattern D): ");
        Scanner input = new Scanner(System.in);
        String word;
        char pattern = input.next().charAt(0);
        
        Switch(pattern) {
            case 'A': PatternA(word);//pattern a method which will execute once user chooses their pattern
            break;
            case 'B': PatternB(word);//pattern b method which will execute once user chooses their pattern
            break;
            case 'C': PatternC(word);//pattern c method which will execute once user chooses their pattern
            break;
            case 'D'; PatternD(word);//pattern d method which will execute once user chooses their pattern
            break;
            default: System.out.println("You have entered an invalid option"); //Tells the user that the input is invalid
            break;
        }
    public static void PatternC(String word){
        int i;

        for(i = 0; i < word.length(); i++){
            for(int count = word.length()-1; count >= i; count--){
                System.out.print(" ");
            }
        }for(int j = i; j >=0; j--){
            System.out.print(word.charAt(j) + " ");
        }
        System.out.println(" ");
    
    } return;
    public static void PatternD(String word) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input a word to use");
        String word = scnr.next();

        for(int i = 0; i < word.length(); i++){
            for(int j = word.length()-1-i; j>= 0; j--){
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println(" ");
        }
    }
    public static void PatternA(String word) {
            Scanner scnr = new Scanner(System.in); //initialize the scanner
            String str = scnr.next();
    
            for(int rownumber = 0;rownumber < str.length();rownumber++){  //for each line count  up 
    
                for(int Characterposition = 0; Characterposition <= rownumber; Characterposition++){  //Print the same number of Letters in respect as the row number
                    System.out.print(str.charAt(Characterposition));
                }
                System.out.println();
            }
    }
    public static void PatternB(String word) {
        Scanner scnr = new Scanner(System.in); //Scanner method to take in the input 
        String str = scnr.next(); //will take in the next line
        
        for(int rownumber = 1;rownumber < str.length();rownumber++){  //for each line count  up 
            for(int Characterposition = 0; Characterposition < str.length()-rownumber; Characterposition++){  //Print the same number of Letters length.string-rownumber
                System.out.print(str.charAt(Characterposition));
            }
            System.out.println();
        }
    }
}            
