import java.util.Scanner;

public class TransferFees {
public static void main(String[] args) {
    
System.out.print("Enter the Transfer Amount (USD): " );
Scanner myscanner = new Scanner(System.in);
    
double transferamt = myscanner.nextDouble();
double highnumber1 = 0.26;
double highnumber2 = 999.99;
double highnumber3 = 49999.99;
double highnumber4 = 10000.00;
double highnumber5 = 50000.00;
double highnumber6 = 99999.99;
double highnumber7 = 100000.00;
boolean outcome;    

if (transferamt <= highnumber2 && transferamt >= highnumber1) {
    outcome = true;
    System.out.printf("Range $0.26-$9,999.99: \t%s" , outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.01));
}else{
    outcome = false;
    System.out.printf("Range $0.26-$9,999.99: \t\t%s", outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.01));
}
if (transferamt <= highnumber3 && transferamt >= highnumber4){
    outcome = true;
    System.out.printf("Range $10,000-$49,999.99: \t%s" , outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.0075));
}else{
    outcome = false;
    System.out.printf("Range $10,000-$49,999.99: \t%s" , outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.0075));
}
if (transferamt <= highnumber6 && transferamt >= highnumber5){
    outcome = true;
    System.out.printf("Range $50,000-$99,999.99: \t%s" , outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.0050));
}else{
    outcome = false;
    System.out.printf("Range $50,000-$99,999.99: \t%s" , outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.0050));
}
if (transferamt >= highnumber7){
    outcome = true;
    System.out.printf("Range >= $100,000: \t%s" , outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.0025));
}else{
    outcome = false;
    System.out.printf("Range >= $100,000: \t\t%s" , outcome);
    System.out.println("");
    System.out.printf("\tPotential Fee: $%.2f\n", (transferamt*0.0025));
}
}
}
