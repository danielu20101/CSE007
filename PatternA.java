/* Daniel Unhuryan
CSE 007
HW #4
This program is intended to create a pyramid sloping downwards*/

import java.util.Scanner;

public class PatternA {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //initialize the scanner
        String str = scnr.next();

        for(int rownumber = 0;rownumber < str.length();rownumber++){  //for each line count  up 

            for(int Characterposition = 0; Characterposition <= rownumber; Characterposition++){  //Print the same number of Letters in respect as the row number
                System.out.print(str.charAt(Characterposition));
            }
            System.out.println();
        }
        
    }
}
