import java.util.Scanner; //declare scanner

/*Daniel Unhuryan
CSE 007
This code is made to convert hexadecimal 
values to display colors and the decimal equivalent of that color*/
public class Color {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);//input values, there is no validation

System.out.println("Please enter the hexadecimal value of the color: ");
String hexadecimal = input.nextLine();

    switch(hexadecimal){
        case("000000"): System.out.println("Your color is Black");//all these switch statements hardcode a color value in hexadecimal
        char val1 = hexadecimal.charAt(0);
        char val2 = hexadecimal.charAt(1);
        break;
        case("FFFFFF"): System.out.println("Your color is White");
        break;
        case("FF0000"): System.out.println("Your color is Red");
        break;
        case("00FF00"): System.out.println("Your color is Green");
        break;
        case("0000FF"): System.out.println("Your color is Blue");
        break;
        case("FFFF00"): System.out.println("Your color is Yellow");
        break;
        case("00FFFF"): System.out.println("Your color is Cyan");
        break;
        case("FF00FF"): System.out.println("Your color is Magenta");
        break;
        case("820082"): System.out.println("Your color is Med. Purple");
        break;
        case("B432B4"): System.out.println("Your color is Faded Purple");
        break;
        case("282828"): System.out.println("Your color is Dark Grey");
        break;
        case("FFA500"): System.out.println("Your color is Orange");
        break;
        case("008000"): System.out.println("Your color is Light Green");
        break;
        case("808000"): System.out.println("Your color is Olive");
        break;
        case("A52A2A"): System.out.println("Your color is Brown");
        break;
        default: System.out.println("Invalid numbers inputted");
    }
    String color = hexadecimal.substring(0,2); //takes in the first two values in hexadecimal and converts to decimal
    String color1 = hexadecimal.substring(2,4); //takes in the second two values in hexadecimal and converts to decimal
    String color2  = hexadecimal.substring(4,6); //takes in the third two values in hexadecimal and converts to decimal

    int redval = Integer.parseInt(color,16); //parseint converts the color first two values, which is depicted in the strings as hexadecimals, to an int 
    int greenval = Integer.parseInt(color1,16); //parseint converts the color first two values, which is depicted in the strings as hexadecimals, to an int
    int blueval = Integer.parseInt(color2,16); //parseint converts the color first two values, which is depicted in the strings as hexadecimals, to an int

    int Min = Math.min(Math.min(redval,greenval), blueval);

    System.out.println("R: " + (redval)+ " G: " +(greenval)+ " B: " +(blueval));
    System.out.println("R: " + (redval-Min)+ " G: " +(greenval-Min)+ " B: " +(blueval-Min));
    } 

}

