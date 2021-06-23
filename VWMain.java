import java.util.Scanner;
public class VWMain {
    public static void main(String[]args){
        
    }

   
    /*
     * Method: getDouble() 
     * Precondition: none 
     * Postcondition: validate positive double input from user before returning that input
     */
    public double getDouble(double number){
        double somenumber = 67*number;
        return somenumber;
    }
    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        double x;
        do {
            if (input.hasNextDouble()) {
                x = input.nextDouble();
                if (x <= 0) {
                    System.out.println("You entered and invalid value -- try again");
                    continue;
                } else {
                    return x;
                }
            } else {
                System.out.println("You entered and invalid value -- try again");
                String junk = input.nextLine();
            }
        } while (true);
    }
}
