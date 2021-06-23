/*Daniel Unhuryan
02/08/21
CSE7 HW1
*/

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double frnheight;

        System.out.print("Please enter the temp in degrees Celcius: ");
        double celcius = scnr.nextDouble();

        frnheight = ((9*celcius)/5)+32; 
        System.out.println("the temperature in fahrenheight today is: " + frnheight);
    }
        
    }