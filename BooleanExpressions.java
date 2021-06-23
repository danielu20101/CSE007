import java.util.Scanner;

public class BooleanExpressions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the transaction amount: ");
    
        double trxnAmt = input.nextDouble();

        System.out.println("Enter the currentbal amount: ");
        double currentbal = input.nextDouble();
        
        boolean a = currentbal < trxnAmt;
        boolean b = currentbal >= trxnAmt;
        boolean c = currentbal <= trxnAmt;
        boolean d = currentbal > trxnAmt;
        boolean e = currentbal != trxnAmt;
        boolean f = currentbal >= trxnAmt;

        System.out.println( !(currentbal < trxnAmt) + " " + (currentbal >= trxnAmt));
        System.out.println( !(currentbal <= trxnAmt) + " " + (currentbal > trxnAmt));
        System.out.println( !(currentbal == trxnAmt) + " " + (currentbal != trxnAmt));
        System.out.println( !(currentbal != trxnAmt) + " " + (currentbal == trxnAmt));
        System.out.println( !(currentbal > trxnAmt) + " " + (currentbal <= trxnAmt));
        System.out.println( !(currentbal >= trxnAmt) + " " + (currentbal < trxnAmt));


        }
        }
        
    
