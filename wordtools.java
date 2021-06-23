/*Daniel Unhuryan
Professor Ziltz
CSE 007
This prgram is made to use 6-7 different methods to manipulate strings*/
import java.util.Scanner;

public class wordtools {
   public static void main(String[] args) {
    String input;
    String chars = "chars"; 
    String words = "words"; 
    String find = "find"; 
    String replace = "replace"; 
    String space = "space"; 
    String quit = "quit";
    int count = 0;
    String sampletext = "A";//We must initialize sampletext with some value or it will not work

    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a sample text: ");
    
    input = scnr.nextLine();
    sampleText(input);

    while(count < 1){
    String option = printMenu(chars, words, find, replace, space, quit);//all of the input are declared as strings
    if(option.equals("quit")){
        count = 1;
    }else if(option.equals("chars")){
        System.out.println("Number of non-whitespace characters: " + getNumOfNonWSCharacters(input));//cannot concatenate with void, convert GNONWSC to int method
        break;
    }else if(option.equals("words")){
        System.out.println("The number of words is: " + getNumOfWords(input));
        break;
    }else if(option.equals("find")){
        System.out.println("the word " + find + " has " + findText(find, input) + " occurrance(s)");
        break;
    }else if(option.equals("replace")){
        System.out.println("edited text: " + replaceExclamation(input));//this is the println statement that replaces exclamation
        break;
    }else if(option.equals("space")){
        System.out.println("edited text: " + shortenSpace(input));
        break;
    }else{
        System.out.println("Invalid option"); //prints out if user enters an invalid option
    }
}
}
    public static void sampleText(String input){
    System.out.println("You entered: "+ input);
    }

    public static String printMenu(String chars, String words, String find, String replace, String space, String quit){
        
        System.out.println("Menu");
        System.out.println(chars + " - Number of non-whitespace characters");
        System.out.println(words + " - Number of words");
        System.out.println(find + " - Find text");
        System.out.println(replace + " - Replace all !'s");
        System.out.println(space + " - Shorten spaces");
        System.out.println(quit + " - quit");
        System.out.println("Choose an option: ");
        
        Scanner scnr = new Scanner(System.in);
        String option = scnr.next();//we are including the scanner inside the method so that if user enters wrong input, we can get reprompted since printMenue will be asked again
        return option;
    }
    public static int getNumOfNonWSCharacters(String input){//declare this as int so that you can use the return statement
        int characters = 0;
        for (int i = 0, length = input.length(); i < length; i++) {//use iswhitespace method using the for loop
            char c = input.charAt(i);
            if (!Character.isWhitespace(c)) {//user Character
              characters++;
            }
    } return characters;
}
public static int getNumOfWords(String input){
    int count = 0;
    boolean word = false;
    int WordEnding = input.length() - 1;

    for (int i = 0; i < input.length(); i++) {
        
        if (Character.isLetter(input.charAt(i)) && i != WordEnding) {
            word = true;
            
        } else if (!Character.isLetter(input.charAt(i)) && word) {
            count++;
            word = false;
            
        } else if (Character.isLetter(input.charAt(i)) && i == WordEnding) {
            count++;
        }
    }return count;
}public static int findText(String find, String sampleText){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the word you are searching for");
    find = scnr.next();
    String wordarray[] = sampleText.split(" ");
    int count = 0;

    for (int i = 0; i < wordarray.length; i++){
        if (find.equals(wordarray[i]))
        count++;
    }return count;
}public static String replaceExclamation(String input){
return input.replace('!','.');
}public static String shortenSpace(String input){
    // use the replaceAll method
    return input.replaceAll("\\s+", " ");
}
}