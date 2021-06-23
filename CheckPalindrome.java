import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);

    System.out.println("Please enter the word you would like to check as a palindrome");
    String mystring = scnr.nextLine();
    char leftchar,rightchar;

        for (int i = 0; i < mystring.length()/2; i++){
          leftchar = charAt(i);
          rightchar = charAt(mystring.length()-i); 

        if (rightchar != leftchar){
            System.out.println("The word is a palindrome");
        }else if (char rightchar =! char leftchar){
            System.out.println("The word is not a palindrome");
        }
    }
        /*for (int i = 0; i < mystring.length(); i++){
            char leftchar = mystring.charAt(mystring.length()-i);
            char rightchar = mystring.charAt(i);
        if (leftchar != rightchar) {
                System.out.println("The word is not a palindrome");
            }
        else if(leftchar == rightchar) {
                System.out.println("The word is a palindrome");*/
        }

        }
    }
}
