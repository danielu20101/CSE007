import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class sort2D{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("How many Rows in the array? ");
        int row = scnr.nextInt();
        System.out.println("How many columns in the array? ");
        int columns = scnr.nextInt();
        Integer [] valarr = new Integer[row*columns];
        for(int i = 0;i<row*columns;i++){
            valarr[i] = i;
        }
        
        List<Integer> intList = Arrays.asList(valarr);
		Collections.shuffle(intList);
        intList.toArray(valarr);
        
        int[][] arr = new int[row][columns];
        int count = 0;
        for(int i = 0; i<row;i++){
            for(int j = 0; j<columns;j++){
                arr[i][j] = valarr[count];
                count++;
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            sorter(arr[i]);
            printArray(arr[i]);
        }


    }
    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void sorter(int[] arr){
        int [] tempArr = new int[arr.length];
        
        for(int i = 0;i<arr.length; i++){
            int min = arr[i];
            int index = i;
            for(int j = i; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }

            }
            arr[index] = arr[i];
            arr[i] = min;

        }
    }
}
