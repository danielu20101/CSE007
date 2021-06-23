import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int numVals;
        System.out.println("Enter the number of integers to average");
        while(true){
            boolean correct = scnr.hasNextInt();
            if(correct){
                numVals = scnr.nextInt();
                break;
            }else{
                System.out.println("Incorrect input, try again");
                String junk = scnr.next();
            }
        }
    while(counter < numVals){
        System.out.println("Enter an integer value");
        while(true){
            boolean correct = scnr.hasNextInt();
            if(correct){
                int val = scnr.nextInt();
                sum += val;
                counter++;
                break;
        }else{
            System.out.println("Incorrect input, please try again");
            String junk = scnr.next();
        }
    }
}
double average = (double) sum/numVals;
System.out.println("The average is " + average);
scnr.close();
    }
}
