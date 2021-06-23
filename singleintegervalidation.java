import java.util.Scanner;
public class singleintegervalidation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a positive value please");
        boolean valid = false;
        int length = keyboard.nextInt();

        while (true) {
            if (keyboard.hasNextInt()) {
                if (length <=0) {
                    System.out.println("Not a positive number.");
                    System.out.println("Enter a positive number: ");
                }
                else{
                    valid = true;}
                
            }
            else {
                String junk = keyboard.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a positive number: ");
            }
        }
    }
}
