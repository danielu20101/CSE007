import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Searchalgorithms{
    public static void main(String[] args) {
        System.out.println("What size 1d array would you like?");
        Scanner scnr = new Scanner(System.in);
        int size = scnr.nextInt();
        System.out.println("Enter 1 for a random array, " +
                "2 for an array in ascending order and " +
                "3 for an array in descending order.");
        int arrayType = scnr.nextInt();
        int[] arrayToPlay = new int[size];
        if (arrayType == 1) {
            arrayToPlay = randomArray1d(size);
            System.out.println(Arrays.toString(arrayToPlay));
        }
        else if (arrayType == 2) {
            arrayToPlay = ascendArray1d(size);
            System.out.println(Arrays.toString(arrayToPlay));
        }
        else if (arrayType == 3) {
            arrayToPlay = reverseArray1d(size);
            System.out.println(Arrays.toString(arrayToPlay));
        }

        System.out.println("What number would you like to search for?");
        int key = scnr.nextInt();
        int index = linearSearch1d(arrayToPlay,key);
        if (index != -1) {
            System.out.println("Your key was found at index " + index);
        }
        else {
            System.out.println("Your key was not found");
        }

        if (arrayType == 2) {
            System.out.println("Performing a binary search on your sorted array.");
            index = binarySearch1d(arrayToPlay,key);
            if (index != -1) {
                System.out.println("Your key was found at index " + index);
            }
            else {
                System.out.println("Your key was not found");
            }
        }

        System.out.println("Enter the number of rows in your 2D array: ");
        int rows = scnr.nextInt();
        System.out.println("Enter the number of columns in your 2D array: ");
        int cols = scnr.nextInt();
        int[][] randomArray2dim = randomArray2d(rows,cols);
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(randomArray2dim[i]));
        }
        System.out.println("Enter a number to search for in your 2D array: ");
        key = scnr.nextInt();
        int[] indexArray = linearSearch2d(randomArray2dim,key);
        if (indexArray[0] != -1) {
            System.out.println("Your key was found in row " + 
                    indexArray[0] + ", column " + indexArray[1] );
        }
        else {
            System.out.println("Your key was not found");
        }



    }








    public static int[] randomArray1d(int num){
        int[] arr = new int[num];
        for (int i = 0; i < num; i++){
            arr[i] = (int)(Math.random()*num); 
        }
        return arr;
    }
    public static int[] ascendArray1d(int num){
        int[] arr = new int[num];
        arr[0] = (int)(Math.random()*num);
        for (int i = 1; i < num; i++){
            arr[i] = arr[i-1] * (int)(Math.random()*num); 
        }
        return arr;
    }
    public static int[] reverseArray1d(int n){
        int[] a = ascendArray1d(n);
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        return b;
    }
    
    public static int linearSearch1d(int[] list, int key){
        int answ = -1;
        for(int i =0;i<list.length;i++){
            if(list[i] == key){
                System.out.println(i+" Comparisons performed.");
                answ = i;
            } else{
                answ = -1;
            }
        }
        return answ;
    }
    public static int binarySearch1d(int arr[], int x) { 
        int max =  arr.length - 1;
        int min = 0;
        int mid = -1;
        boolean endif = true;
        int count = 0;
        do{
            count++;
            mid = (max+min)/2;
            if(arr[mid]>x){
                min = mid+1;
                //System.out.println("Checking lower");
            } else if(arr[mid]<x){
                max = mid-1;
                //System.out.println("Checking Higher");
            } else if(arr[mid]==x){
                System.out.println("There were "+ count+ "searches performed");
                endif = false;

            } else{
                System.out.println("there is no match");
                endif = false;
            }
        }while(endif);

        return mid;
    } 
    public static int[][] randomArray2d(int rows, int cols){
        Integer [] valarr = new Integer[rows*cols];
        for(int i = 0;i<rows*cols;i++){
            valarr[i] = i;
        }
        
        List<Integer> intList = Arrays.asList(valarr);
		Collections.shuffle(intList);
        intList.toArray(valarr);
        
        int[][] arr = new int[rows][cols];
        int count = 0;
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<cols;j++){
                arr[i][j] = valarr[count];
                count++;
            }
        }
        return arr;
    }
    public static int[] linearSearch2d(int[][] searchArray2d, int key){
        int count = 0;
        int [] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for(int i = 0;i<searchArray2d.length;i++){
            for(int j = 0;j<searchArray2d[i].length;i++){
                count++;
                if(searchArray2d[i][j] == key){
                    arr[0] = i;
                    arr[1] = j;
                    System.out.println("The search ran "+ count+" times.");
                }
            }
        }
        return arr;
    }
    
}
