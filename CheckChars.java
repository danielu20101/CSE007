import java.util.Scanner;

public class CheckChars{
    public static void main(String[]args){
        int count = 0;
        Scanner scan = new Scanner(System.in);
        char[] letters = new chars[10];
        for(int i=0; i<letters.length; i++){
            
            //the following while loop should run forever, breaking off the user enters a character in range
            while(count < 10){
                char temp = scan.next();
                if(scan.hasnext() && scan.next().chartAt(0) < 'Z' && scan.next().chartAt(0) > 'A'){
                    letters[i] = temp;
                    count+=1;                  
                }else{
                    System.out.println("You have entered an incorrect value, please try again.");
                }
            }
            //ToDo: complete the do while loop to validate temp as a character between A-Z; breakout of do while loop if in range
        }
        for (int i = 0; i < letters.length-1; i++) {//THIS IS THE LOOP THAT FIGURES OUT IF THE ARRAY IS IN DESCENDING ORDER
            if (letters[i] > letters[i+1]) {
                System.out.println("The data is not in descending order");
            } else {
            System.out.println("The data is in descending order");
        }
        //ToDo: verify that the array was entered in descending order

    }
    }
}
    