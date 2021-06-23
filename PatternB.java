/* Daniel Unhuryan
CSE 007
HW #4
This program is intended to create a pyramid sloping upwards*/

import java.util.Scanner;
/*
String Respect = "RESPECT";
for (int i = Respect.length()-1; i>=0; i--){
    System.out.println(Respect.charAt(i));
}
*/

public class PatternB {
public static void main(String[] args) {
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