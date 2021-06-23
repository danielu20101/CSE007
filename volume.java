/*Daniel Unhuryan
CSE 007
03/29/21
This program is meant to calculate the volume of several different shapes.*/
import java.util.Scanner;

public class volume {
public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String shape;
    double length;
    double width;
    double height;
    double radius;
    double pi = 3.14159263;
    int count = 0;

    while(count < 1){ //Input validation using count for the word user inputs
        System.out.println("(either prism, sphere, or cylinder)Please enter the shape you would like to find the volume of: ");
        shape = scnr.next();
        //check if an integer
        if (!shape.equals("prism") && !shape.equals("sphere") && !shape.equals("cylinder")){
            //check if its not the right shape
                System.out.println("The shape must be either a sphere, prism, or a cylinder");
        }else if(shape.equals("prism")) {
            System.out.println("Please enter the value of the length of the prism: ");
            length = getdouble();
            System.out.println("Please enter the value of the width of the prism: ");
            width = getdouble();
            System.out.println("Please enter the value of the height of the prism: ");
            height = getdouble();
            System.out.println("The volume of your prism is: " + calcprismVolume(length, width, height));
            
            count = 1;
        } else if(shape.equals("sphere")) {
            System.out.println("Please enter the value of the radius of the sphere: ");
            radius = getdouble();
            System.out.println("The volume of your sphere is: " + calcsphereVolume(radius));
            //adjust count to break the while loop
            count = 1;
        } else if(shape.equals("cylinder")) {
            System.out.println("Please enter the value of the radius of the cylinder: ");
            radius =getdouble();
            System.out.println("Please enter the value of the height of the cylinder: ");
            height = getdouble();
            System.out.println("The volume of your sphere is: " + calccylinderVolume(radius, height));
            //adjust count to break the while loop
            count = 1;
        }
    }
    }

    public static double getdouble() {//input validation methdo
        Scanner scnr2 = new Scanner (System.in); //remember to close the scanner later
        double value; 
        int count = 0;
        
        while(count < 1){
            System.out.println("Enter a double value");
            if(scnr2.hasNextDouble() == false){ 
                scnr2.next();
                System.out.println("Please enter a double value ");
            }else{
                value = scnr2.nextDouble(); //collect
                if (value < 0 ){
                    System.out.println("Enter a positive value");
                    continue;
                }
                count = 1;
                return value;
            }    
        } return -1;
    }
    public static double calcprismVolume(double length, double width, double height) {//calculates the volume of the prism
        Double PrismVolume;

        PrismVolume = length*width*height;
        return PrismVolume;
    } 
    public static double calccylinderVolume(double radius, double height) {//calculates the volume of the cylinder
        double cylinderVolume;
        double pi = 3.14159265;

        cylinderVolume = radius*radius*height*pi;
        return cylinderVolume;
    }
    public static double calcsphereVolume(double radius){//calculates the volume of the sphere
        double pi = 3.14159265;
        double sphereVolume; 

        sphereVolume = (double) radius*radius*radius*(4/3)*pi;
        return sphereVolume;
    }
}
