/*Daniel Unhuryan
02/08/21
CSE7 HW1
*/

import java.util.Scanner;

public class TempConverter2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        double celcius;

        System.out.print("Please enter the temp in degrees Fahrenheight: ");
        double fahrenheight = scnr.nextDouble();

        celcius = ((fahrenheight - 32)* (5.0/9.0)); 
        System.out.printf("the temperature in celcius today is: %.2f \n" , celcius);
    }
        
    }
