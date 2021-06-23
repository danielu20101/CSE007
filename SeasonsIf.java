import java.util.Scanner;
public class SeasonsIf {
    public static void main(String[] args) {
        System.out.print("Enter a date (String, int):" );
        Scanner input = new Scanner(System.in);
        String month = input.next();
        int day = input.nextInt();

        String season="";
        if ((month.equals("January")) || (month.equals("February"))) {
            season = "winter";
        } else if (month.equals("March")) {
            if (day < 20) { 
                season = "winter";
            } else {
                season = "spring";
            }  
        } else if ((month.equals("April")) || (month.equals("May"))) {
            season = "spring";
        } else if (month.equals("June")) {
            if (day <= 20) { 
                season = "spring";
            } else {
                season = "summer";}}
            else if ((month.equals("July")) || (month.equals("August"))) {
                season = "summer";}
            else if (month.equals("September")){
                 if (day < 21) {
                        season = "summer";
                        } else {
                            season = "autumn";
                        }
                    }
            if ((month.equals("October")) || (month.equals("November"))) {
                season = "autumn";}
                else if (month.equals("December")){
                    if (day <= 20){
                        season = "autumn";
                    } else {
                        season = "winter";
                    }
                }
            System.out.println(month+" "+day+" falls during "+ season);
            input.close();
    }
} 


