import java.util.Scanner;
public class OverloadEquals {
   public static void main(String[] args) {
       Scanner myScanner = new Scanner(System.in);
       System.out.println("Please input a word: ");
       String myWord1 = myScanner.nextLine();
       System.out.println("Please input another word: ");
       String myWord2 = myScanner.nextLine();     
       boolean wordEqual = findEqual(myWord1,myWord2);    
       if (wordEqual) {
           System.out.println("Your words are equal.");
       }
       else {
           System.out.println("Your words are not equal.");
       } 
 System.out.println("Please input an integer: ");
       int myInt1 = myScanner.nextInt();
       System.out.println("Please input another integer: ");
       int myInt2 = myScanner.nextInt();      
       boolean intEqual = findEqual(myInt1,myInt2);       
       if (intEqual) {
           System.out.println("Your integers are equal.");
       }
       else {
           System.out.println("Your integers are not equal.");
       }

System.out.println("Please input an integer: ");
       int myInt3 = myScanner.nextInt();
       System.out.println("Please input a double: ");
       Double myDouble1 = myScanner.nextDouble();      
       boolean intDoubEqual = findEqual(myInt3,myDouble1);       
       if (intDoubEqual) {
           System.out.println("Your integers and doubles are equal.");
       }
       else {
           System.out.println("Your integers and doubles are not equal.");
       }     
   }

   public static boolean findEqual(String string1, String string2) {
       if (string1.equals(string2))
           return true;
       else
           return false;
   }  
   public static boolean findEqual(int int1, int int2) {
       if (int1 == int2)
           return true;
       else
           return false; 
   }
   public static boolean findEqual(int myInt3, double myDouble1){
       if(myInt3 == myDouble1)
           return true;
       else
           return false;
   }
}
