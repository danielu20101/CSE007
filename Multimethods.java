/*Daniel Unhuryan
CSE 007
Professor Ziltz
The purpose of this program is to practice using ragged arrays, 2d and 3d, and finding the largest array 
inside the array or the longest array inside, or shuffling the array in general*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Multimethods {
public static void main(String[] args) {
char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
Scanner myScanner = new Scanner(System.in);
char[][] user2D = declare2D(myScanner);
char[][][] user3D = declare3D(myScanner);
int[] largestElem = locateLargest(user2D);
char[] longestRow = locateLongest(user3D);

System.out.println("The largest element(2D) is at ["+ 
largestElem[0] +", "+largestElem[1]+"]  and is: "+ 
user2D[largestElem[0]][largestElem[1]]);
System.out.println("The longest row is at location: "+longestRow);
System.out.println(Arrays.toString(longestRow));
print2D(user2D);
charshuffle(user2D);
print2D(user2D);
print3D(user3D);
char[][] myRaggedArray = new char [2][3]; // TODO: Declare ragged array
charshuffle(myRaggedArray);

print2D(myRaggedArray);

char[][][] myRaggedArray3d = 
{{{'b','d','f','z','z','y'},{'k','r'},{'h','i'},{'a','t'},{'j','x'}}, 
    {{'a', 'p'}, {'q', 's'}, {'v', 'e'}, {'m', 'r'}, {'g', 'o'}},
    {{'t', 'u'}, {'d','o', 'g'}, {'c', 'a','t'}}};

char[] longestRaggedRow = locateLongest(myRaggedArray3d);
System.out.println("The longest row is at location: " + longestRaggedRow);
System.out.println(Arrays.toString(longestRaggedRow));

}
  public static char[][] declare2D(Scanner scnr){ //attempt at first method
    System.out.println("Please enter the dimensions of the 2D array");
    int x = scnr.nextInt();
    int y = scnr.nextInt();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    int randomIndex = (int) (Math.random()*alphabet.length);

    char [][] array = new char[x][y];
    for(int row = 0; row < array.length; row++){   
        for(int col = 0;col < array[row].length; col++){
            System.out.print((int) (Math.random()*alphabet.length));  
        }
        return array;
    }
    
  }
  public static char[][][] declare3D(Scanner scnr){
    System.out.println("Please enter the dimensions of the 3D array");
    int x = scnr.nextInt();
    int y = scnr.nextInt();
    int z = scnr.nextInt();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    char [][][] array2 = new char[x][y][z];
    for (int i = 0; i < array2.length; i++){
        for(int j = 0; j < array2[i].length; j++){
            for (int k = 0; k < array2[i][j].length; i++){
                System.out.print((int) (Math.random()*alphabet.length));
            }
        }
    }
    return array2;
  }
  public static int[] locateLargest(int[][] a) {
    int max = a[0][0];
    int x = a.length;
    int [] largestLocation = new int[2];
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] > max) {
                max = a[i][j];
                largestLocation[0]=i;
                largestLocation[1]=j;
            }
        }
    }
    // finally return maxElement
    return largestLocation;
}
  
  public static char[] locateLongest(char[][][] array) {
    int max=0;
    char [] maxArray = new char[0];
    //char max [][][] = new char[0][0][0];
    for(int i=0 ; i<array.length ; i++){
        for(int j=0 ; j<array[i].length ; j++){
            if(array[i][j].length > max){
                max = array.length;
                maxArray = array[i][j];
            }
        }
    }
    return maxArray;
}


  public static char[][] charshuffle(char[][] m) {//attempt at shuffle method
      int numOfElements = m.length;
      for(int i = 0; i < m.length; i++){
          int s = i + (int)(Math.random() * (numOfElements - i));

          Object temp = m[s]; //shuffling is occuring here
          m[s] = m[i];
          m[s] = (char[]) temp;
      }
      return m;
  }

    public static void print2D(char[][] m) {
        for(int i = 0; i <m.length;i++){
            for(int j = 0; j<m[i].length;i++){
                System.out.print(m[i][j]+ " ");
            }
        }
        System.out.println();
  }
    public static void print3D(char[][][] m) {
        for(int i = 0; i <m.length;i++){
            for(int j = 0; j <m[i].length; j++){
                for(int k =0; k < m[i][k].length; k++){
                    System.out.print(m[i][j][k]+ " ");
            }
        }
    }
    System.out.println();
}
}
