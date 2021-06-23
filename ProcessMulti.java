/*Daniel Unhuryan
CSE 007
Professor Ziltz
This program is created to practice using methods on ragged arrays and initializing ragged arrays*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ProcessMulti {
    public static void main(String[]args){
        int length = getInt(100); //creates the length from 1 to 100
        double[][] randomRagArr = createRandom(length);
        assign(randomRagArr);
        largestAvg(randomRagArr);
    }

    public static int getInt(int value){ //creates a random number from 0 to 1
        Random randomNumGen = new Random();
        int myNum = randomNumGen.nextInt(value)+1;
        return myNum;
    }

    public static double[][] createRandom(int length){ //creates the array with random numbers
        double[][] multiArray = new double[length][];//pretty sure there is a small issue here, would like to know what it is. 
        for(int i = 0; i < length; i++){
            multiArray[i] = new double[(int) (Math.random() * 10)+1];
            for(int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = (int) Math.random()*10;
            }
        }
        return multiArray;
        /*createRandom() takes as input an integer representing the length of the 2D array, and 
        the 2D array reference (i.e. number of rows) and will randomly create and 
        initialize the individual arrays (each row) with a random length 1-10 (i.e. 
        setting number of columns for each row individually).*/
    }
    public static void assign(double[][] makeRandom){
        Random rand = new Random();
        for(int i = 0; i < makeRandom.length; i++){
            for(int j = 0; j < makeRandom[i].length; j++){
                makeRandom[i][j] = (rand.nextInt(10)+1);
            }
        }
    }
    public static void largestAvg(double[][]createRandom){
        double sum = 0;
        double[] avgArray = new double[createRandom.length];
        for(int i = 0; i < createRandom.length; i++){
            for(int j = 0; j < createRandom[i].length; j++){
                sum+=createRandom[i][j]; 
            }
            if(createRandom[i].length!=0){
                avgArray[i] = sum / createRandom[i].length;
            }
            sum = 0; //sum needs to be reset
        }
        
        int maxIndex = 0;
        for(int i = 0; i<avgArray.length; i++){
            if(avgArray[i]>avgArray[maxIndex]){
                maxIndex = i;
            }
        }
        //for(double[]array: createRandom){
           // System.out.println(Arrays.toString(array));
        //}
        System.out.println(maxIndex);
        System.out.println(Arrays.toString(avgArray));
    }
}
