import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        int n;
        boolean isPalindrome = true;
        int lastindex;
        int left,right;

        System.out.println("Please enter a number or word");
        
        if (sc.hasNextInt() ) {//then treat the input as an integer
            n = sc.nextInt();

            //determine the length of the integer
            int remainder = n; //n is the 
            int L=0; //L represenets length
            while (remainder > 0) {
                remainder = remainder/10;/*dividing the number by 10 every time
                while it is greater than 0 in order to get how many digits there are */
                L++;
            }
            System.out.println("Length is " + L); //L gets incremented the amount of times 10 goes into n

            int d;

            for (int i = 0; i < (L/2); i++) { //i is 0 but gets incremented by the time it reaches length over 2
                left = (n / (int)(Math.pow(10,L-1-i)) )%10; //(L-1-i) = length -1 -i || 10^L-1-i
                System.out.println("left is " + left);
                right = n / (int)Math.pow(10,i) % 10;
                System.out.println("right is " + right);

                if (left != right ) {//compare left char to right char
                    System.out.println("different ");
                    isPalindrome = false;//then we're done , so quit the loop..the number is proved not a palindrome
                    break;
                }
                else System.out.println("same");
            }
            
        }


        else { //then treat the input as a string
            
            
            s = sc.next();//get the user input as string
            lastindex = s.length()-1; //last index of string is the length-1
            //loop thru each character in the string until we get to the middle
            for (int i = 0; i < s.length()/2; i++) { 
                if ( s.charAt(i) != s.charAt(lastindex - i) ) {//compare left char to right char
                    isPalindrome = false;//then we're done , so quit the loop..
                    break;
                }
            }
            

        }
        System.out.println("is your input a palindrome? " + isPalindrome);


    }

}