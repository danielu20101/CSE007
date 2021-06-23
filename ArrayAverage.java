import java.util.Random;
import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(20) + 1;
        int count = 0;
        
        int list[] = new int[10];

        while(count < 10){
            for(int num1 : list){
                System.out.println(num);
                count+=1;
            }
        }

        Arrays.sort(list);
        System.out.println("Minimum = " + list[0]);
        System.out.println("Maximum = " + list[list.length-1]);
        System.out.println("Average = " + num);
        
        }
    }

