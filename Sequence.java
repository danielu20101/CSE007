import java.util.Scanner;

public class Sequence {

 public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num;
        int count;
        boolean isnumber = false;
        
do{
System.out.println("Enter a number between 1-100");
} while{(isnumber = false)}
if (num >= 1 || num <= 100){
    num = scnr.nextInt();
        isnumber = true;
}else{
    System.out.println("Invalid input");
    isnumber = false;
    scnr.next();
} 

if (num == 1){
    System.out.println("1 /n"); // /n for the new line
}else if(num%2 == 0){
    System.out.println(num/2);
    System.out.println(num);

    if (count == 10){
        System.out.println("/n");  // /n for the new line
        count =1;
    }
}else if (num % 2 == 1){
    System.out.println(num*2 +1); 
}
}
}