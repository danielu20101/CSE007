import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class searchalgos {
    public static void main(String[] args) {
    int length = -1;
    createanarray(length);
}
public static void createanarray(int length){
    Scanner scnr = new Scanner(System.in);
    
    int count = 0;
    while (count < 1){
        if(count == 0){
        System.out.println("Enter the size of the array");
    }if(scnr.hasNextInt()){
        if(length > 0){
        length = scnr.nextInt();
        count = 1;
        }else if(length < 0){
            System.out.println("Please enter a positive value");
            String junk2 = scnr.next();
        }
    }else if(!scnr.hasNextInt()){
        System.out.println("Please enter an integer value");
        String junk = scnr.next();
    }
}

    Random rand = new Random();
    int[] array = new int[length];
    for(int i = 0; i <array.length; i++){
        array[i] = rand.nextInt(9) + 1; 
        }
        System.out.println(Arrays.toString(array));
    }
}
