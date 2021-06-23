import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (counter < 5) {
            while(true){
                System.out.println("Enter the 5 numbers to sum");
                boolean correct = keyboard.hasNextInt();
                if(correct) {
                    int val = keyboard.nextInt();
                    sum += val;
                    counter++;
                    break;
                }else{
                    System.out.println("You entered an invalid value; Try again: ");
                    String junk = keyboard.next();
                }
            }
        }
        System.out.println("Your sum is: " + sum);
    }
   
        
}