/*Daniel Unhuryan
CSE 007
Professor Ziltz
This program is made to practice overloading methods and recreate methods such as charat 
called element at which will return the index of an occurrance of a letter or add and element 
if that element is not present there.  */

import java.util.Arrays;
public class OverloadArrays {
    public static void main(String[]args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        char[] arr3 = {'1','2','3','4','5'};
        char [] arr4 = {'a','b','c','d','e'};
        int[] append = join(arr1, arr2);
        char[] appendC = join(arr3, arr4);
        System.out.println(equals(arr1, arr2));
        System.out.println(equals(arr3,arr4));
        int [] list = {9,3,5,7,2,3,6,3,1};
        char [] list2 = {'a','c','d','r','e','s','r','y','s','p'};
        int value1 = 6;
        char value2 = 'a';
        System.out.println(Arrays.toString(append));
        System.out.println(Arrays.toString(appendC));
        System.out.println(indexOf(list, value1));
        System.out.println(indexOf(list2, value2));
        System.out.println(elementAt(list, value1));
        System.out.println(elementAt(list2, value2));
        System.out.println(addElement(list,6,value2));
        System.out.println(addElement(list2,6,value2));
    }

    public static boolean equals (int [] list1, int [] list2){
        if(list1.length == list2.length){
            for(int i = 0; i < list1.length; i++){

                    if(list1[i] != list2[i]){//use one for loop with i iteration
                        return false; // if some element is not equal in 
                }
            }
            return true; //return true if all elements being iterated through are equal
        }
        return false;
    }
    public static boolean equals (char [] list1, char [] list2){
        if(list1.length == list2.length){
            for(int i = 0; i < list1.length; i++){

                    if(list1[i] == list2[i]){//use one for loop with i iteration
                        return true;
                } else return false;
            }
        } 
        return false;
    }
    public static int[] join (int [] list1, int [] list2){
 
        int length = list1.length + list2.length;
        int[] append = new int[length];//create new array of combined lengths since it is impossible to add two arrays

        int i = 0;
        for (int elements : list1) {
            append[i] = elements;
            i++;
        }

        for (int element : list2) {
            append[i] = element;
            i++;
        }

        System.out.println(Arrays.toString(append));
        return append;
    }
    public static char[] join (char [] list1, char [] list2){
 
        int length = list1.length + list2.length;
        char[] arr3 = new char[length]; //create new array of combined lengths since it is impossible to add two arrays

        int i = 0;
        for (char elements : list1) { //use a for each loop to append each element to the arr3 created array
            arr3[i] = elements;
            i++;
        }

        for (char element : list2) { //now do the same thing for the other array, basically just scooping indices values and placing them into another place
            arr3[i] = element;
            i++;
        }

        System.out.println(Arrays.toString(arr3));
        return arr3;
    }
    public static int indexOf (int [] list, int value){
        int index = 0;
        for (int i = 0; i < list.length; i++){//if the index is equal to the value found
            if (list[i] == value){
                value = index;
                System.out.println("The integer was found at index: "+ i);//print where the index was found
            }
        }
        return index;
    }
    public static int indexOf (char [] list, char value){
        char index = 'a';
        for (int i = 0; i < list.length; i++){ 
            if (list[i] == value){ //if the index is equal to the value found
                value = index;
                System.out.println("The integer was found at index: "+ i); //print where the index was found
            }
        }
        return index;
    }
    public static int elementAt (int [] list, int index){
        return list[index]; //will return the element at the index like charat
    }
    public static char elementAt (char [] list, int index){
        return list[index];//will return the element at the index like charat
    }
    public static int addElement (int [] list, int index, int value){
        int finalIndex = 0; //declare a final index
        if(index < 0){ //if the index is less than 0, so a number which is too low, then will replace into 0 index
            list[0]=value;
            finalIndex = 1;
        }else if(index >= list.length){
            finalIndex = list.length;
        }else{
            list[index] = value;
            finalIndex = index+1;
        }
        return finalIndex;
    }
    public static int addElement (char [] list, int index, char value){
        int finalIndex = 0;
        if(index < 0){
            list[0]=value;
            finalIndex = 1;
        }else if(index >= list.length){
            finalIndex = list.length;
        }else{
            list[index] = value;
            finalIndex = index+1;
        }
        return finalIndex;
    }
}
