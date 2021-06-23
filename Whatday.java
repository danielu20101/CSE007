/*Daniel Unhuryan
CSE 007
LAB #4
This program is created to figure out the day of the year based on dd/mm/yyyy, each inputted seperately*/

import java.util.Scanner;

public class Whatday {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int count = 0;//setting count to 0 so that the while loop can start from 0 and loop to 3 when all input day month year are entered correctly
        int day = -1; //this is set to -1 because the loops below were having trouble detecting the variables.
        int month = -1;
        int year = -1; //this is set to -1 because the loops below were having trouble detecting the variables.
        int monthcode = -1; //this is set to -1 because the loops below were having trouble detecting the variables.
        int centurycode =-1; //this is set to -1 because the loops below were having trouble detecting the variables.
        int datecode = -1; //this is set to -1 because the loops below were having trouble detecting the variables.
        int YY = -1;
        int yearcode = -1;
        int leapyearcode = -1;
        int output = -1;

        while(count < 3){
            System.out.println("Please enter the day: ");
            if(count == 0){
                day = scnr.nextInt();
                if( 1<= day && day <= 31){
                    count+=1;//count is increased and reaches 3. Therefore, there is no need to continue asking the user for input.
                }else if(day > 31 || day < 1){
                    System.out.println("Invalid input. Please enter a day in range.");
                }
            }
            if (count == 1){ //Now if the count is 1, then the scanner will prompt the user to now enter the month
                System.out.println("Enter your date's month "); //this is print statement to enter the month
                month = scnr.nextInt(); //the scanner is prompting the user to enter the month
                if( 1 <= month && month <= 12){
                    count+= 1; //count is increased and when it reaches 3, there is no need to continue asking the user for input.
                }
                if (month > 12 || month < 1){
                    System.out.println("Invalid input. Please enter the correct month value between 1-12");
                }
            }
            if (count == 2){ //now count is increased to 2, so at this point, it will now prompt the user to enter a year
                System.out.println("Please enter the year"); //user is prompted to enter the year.
                year = scnr.nextInt();
                if (year>=1700 && year<=2399){ //boundaries of the year
                    count+=1; //count is increased and reaches 3. Therefore, there is no need to continue asking the user for input.
                }else if(year < 1700 || year > 2399){ //if the year does not fall in this value, count does not increase, therefore asking the user to keep asking for input
                    System.out.println("Invalid input. Please enter a date between 1700-2399"); //if incorrect, the system will prompt the user to now enter another input which will be checked again to see if it is valid.
                }
            }
        }


        YY = year%100;
        yearcode = (YY + (YY / 4)) % 7; //computation to convert the year into the yearcode, which will be used in the formula

        if(month == 1 || month == 10){ //if the months realistically fall within these days, they will be hard coded into the following months
            monthcode = 0;
        } else if(month == 2 || month == 3|| month == 11){
            monthcode = 3;
        }else if(month == 4 || month == 7 ){
            monthcode = 6;
        }else if(month == 5){
            monthcode = 1;
        }else if(month == 6){
            monthcode = 3;
        }else if(month == 8){
            monthcode = 2;
        }else if(month ==9 || month ==11) {
            monthcode = 5;//all this code is to convert the months into the month code, which will be used in the formula
        }
        
        
        if(year>=1700 && year<=1799){ //if the years fall within these years
            centurycode = 4;
        }else if(year>=1800 && year<= 1899){ 
            centurycode = 2;
        }else if (year>=1900 && year<=1999){
            centurycode = 0;
        }else if (year>=2000 && year<=2099){
            centurycode = 6;
        }else if (year>=2100 && year<=2199){
            centurycode = 4;
        }else if (year>=2200 && year<=2299){
            centurycode = 2;
        }else if (year>=2300 && year<=2399){   //if the years fall within these years
            centurycode = 1;
        }

        if((((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) && ((month == 1) || (month ==2))) //if the year is divisible by 4 and not divisible by 100 or the year is divisble by 400 and the month is either february or january
        {
           output = ((YY + monthcode + centurycode + datecode-1) % 7); //formula for the leap year
        }
        else {
            output = ((YY + monthcode + centurycode + datecode) % 7); //formula for the year that is not a leap year
        }
        
        if(output == 0){
            System.out.println("The Day is Sunday");//this is the last code to display the day of the year
        }else if(output ==1 ){
            System.out.println("the day is Monday"); 
        }else if(output ==2 ){
            System.out.println("the day is Tuesday");
        }else if(output ==3 ){
            System.out.println("The day is Wednesday");
        }else if(output ==4){
            System.out.println("The day is Thursday");
        }else if(output ==5){
            System.out.println("The Day is Friday");
        }else if(output ==6){
            System.out.println("The Day is Saturday");
        }
}
}

