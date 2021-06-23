import java.util.Scanner;
public class singleintegervalidation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a positive value please");
        boolean valid = false;

        while (true) {
            int num = scnr.nextInt();
            if (scnr.hasNextInt()) {
                if (num <=0) {
                    System.out.println("Not a positive number.");
                    System.out.println("Enter a positive number: ");
                }
                else{
                    valid = true;
                    break;
                    }

                    }
            else {
                String junk = scnr.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a positive number: ");
            }
        }
    }
}
