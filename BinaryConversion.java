/* Daniel Unhuryan
02/15/2021
CSE 7 HW2 
1. A numbering system is a way of representing numbers. For example, people use 
a base-10 numbering system. Binary is base-2
2. Binary is an important numbering system because computers use it to convert 
code into something it understands.
3. Hexadecimal is another numbering system used most of the time to represent colors. i.e, 0000FF->BLUE
Octal, another numbering system, is base is 8 and it uses numbers from 0 to 7 to represent numbers*/

import java.util.Scanner;
public class BinaryConversion {
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a binary number (must be 4 bits):");
        String binaryString = number.nextLine(); 
        System.out.println("The decimal equivalent of the binary number "+ binaryString + " is:" + " " + Integer.parseInt(binaryString,2));   
    }
}
