public class MPG {
    public static void main(String[] args) {
        //using double variables to hold decimal values for the number of gallons and the miles of the trip//

        double gasTrip1 = 9.2; // number of gallons of gas for some trip, called trip1.//
        double gasTrip2 = 11.7; //number of gallons of gas for some trip, called trip2.//
        double milesTrip1 = 191;  //the number of miles for the some trip, called trip1.//
        double milesTrip2 = 221; //the number of miles for some trip, called trip2.//

        // miles per gallon 1, miles per gallon for trip 2, and the total miles per gallon//
        double mpg1, mpg2, mpgTotal;
        
        //Now, print statements will be written using the variables which have miles stored in them as double variables//
        System.out.println("Trip 2 covered "+milesTrip1+" miles");
        System.out.println("Trip 2 covered "+milesTrip2+" miles");
        System.out.println("Trip 1 used "+gasTrip1+" gallons of gas");
        System.out.println("Trip 2 used "+gasTrip2+" gallons of gas");
        
        //Calculations to get the miles per gallon//
        mpg1 = milesTrip1/gasTrip1;
        mpg2 = milesTrip2/gasTrip2;
        mpgTotal = (milesTrip1+milesTrip2)/(gasTrip1+gasTrip2);

        //Print statements for the miles per gallon//
        System.out.println("The miles per gallon for tip 1 was "+mpg1);
        System.out.println("The miles per gallon for the combined trips was " + mpgTotal);


    }
}
