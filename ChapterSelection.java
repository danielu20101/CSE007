import java.util.Scanner; 
import java.util.Arrays;

public class ChapterSelection{
    public static void main(String[] args) {
    int numofchapters = 0;
    int chapters [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int selection [] = new int[15];
    Scanner scnr = new Scanner(System.in);

    int count = 0;
    while(count < 15){
    System.out.println("Enter a 0 or 1 representing the chapters to read (15 times)(ENTER EACH CHAPTER INDIVIDUALLY)"); //trying to get user to enter the number (1 or 0) 15 times
    int input = scnr.nextInt();
    if(count < selection.length){
        selection[count] = input ; //convert the input into an int array 
    }
    count++;
}//This loop 

System.out.println(Arrays.toString(selection));
String output = ""; //this will just be used for spaces in between the chapters
int start = 0; //used as the beginning of the chapter
int finish = 0; //used as the caller to the end of the chapter
boolean startIsFound = false;

for(int i = 0; i < selection.length; i++){
    int currentPage = selection[i];
    if(!startIsFound){
        if(currentPage == 1){
            startIsFound = true;
            start = i+1;
        }
    }
    else{
        if(currentPage == 0){
            finish = i;
            output+=start+"-"+finish+" "; 
            startIsFound=false;
        }
        else if(i == selection.length-1){
            finish = i+1;
            output+=start+"-"+finish+" ";
        }
    }
}
System.out.println(output);

    }
}

