import java.util.Random;
import java.util.Scanner;

public class LogicTest {
    public static void main(String[] args) {
        //Random rand = new Random()
       int num = (int) (Math.random()*99+1);

       Scanner input = new Scanner(System.in);
       

    System.out.printf("Random integer(1-100): %d\n Is %d divisible by 5 and 6\n Your response: ", num,num);
    String response = input.next();

    boolean outcome = response.equals("true");
    boolean divby5and6 = (num%5==0)&&(num%6==0);
    System.out.printf("Feedback: your response was %s\n", outcome==divby5and6);

    System.out.printf("Random integer(1-100): %d\n Is %d divisible by 5 and 6\n Your response: ", num,num);
    String response2 = input.next();

    boolean outcome2 = response2.equals("true");
    boolean divby5or6 = (num%5==0)||(num%6==0);
    System.out.printf("Feedback: your response was %s\n", outcome2==divby5or6);

    System.out.printf("Random integer(1-100): %d\n Is %d divisible by 5 and 6\n Your response: ", num,num);
    String response3 = input.next();

    boolean outcome3 = response2.equals("true");
    boolean divby56 = (num%5==0)||(num%6==0);
    System.out.printf("Feedback: your response was %s\n", outcome2==divby56);

    }
        
    }
