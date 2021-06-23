/*Daniel Unhuryan
02/08/21
CSE7 HW1
This program is made to tell the savings of using more efficient toilets, and compare toilet flush prices when an operator takes into
account the population of a university*/

import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);

       int toilets;
       int litersnew; 
       int litersold;
       int litersconserved;
       double installprice;
       double yearlycostbefore;
       double yearlycostafter;
       double savings;

       System.out.println("Enter the campus population: ");
       int pop = scnr.nextInt();

       toilets = (pop/10);
       litersnew = toilets * (24*2);
       litersold = toilets * (24*15);

       litersconserved = litersold - litersnew;
       System.out.println("Quantity of water saved: " + litersconserved + " liters/day");

       installprice = (toilets * 100);
       System.out.printf("Cost of installing new toilets: $%.2f\n" , installprice);

       yearlycostbefore = (litersold / 3.785) * (0.02*365);
       System.out.printf("Yearly cost of water before: $%.2f\n" , yearlycostbefore);

       yearlycostafter = (litersnew / 3.785) * (0.02*365);
       System.out.printf("Yearly cost of water after: $%.2f\n" , yearlycostafter);

       savings = (yearlycostbefore - yearlycostafter) - (installprice);
       System.out.printf("Savings in cost of water (first year): $%.2f\n" , savings);
    }
        
    }
