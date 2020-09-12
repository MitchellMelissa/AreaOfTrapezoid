/*
Area of Trapezoid Calculator
This program will calculate the area for a trapezoid in cm
To calculate the area, this program will accept inputs from users 
for each side of the trapezoid 
Area = ((a+b)/2)*h
*/
package areaoftrapezoid;
import java.util.Scanner;
/**
 *
 * @author Melissa Mitchell
 */
public class AreaOfTrapezoid {

    public static void main(String[] args) {
        double a = 0.0; //long base 
        double b = 0.0; //short base
        double h = 0.0; //height
        double A = 0.0; //area
        String go = "yes";
        String keepgoing = "yes";
        Scanner scan = new Scanner(System.in);
        
        while (go.equals("yes")){    
            System.out.println();
            System.out.println("Enter long base of Trapeziod in centimetres:");
            a = scan.nextDouble();
            
            System.out.println("Enter small base of Trapezoid in centimetres:");
            b = scan.nextDouble();
            
            System.out.println("Enter height of Trapezoid in centimetres:");
            h = scan.nextDouble();
            
            A = ((a + b)/2)*h;
            System.out.println();
            System.out.println("The area of the Trapezoid is: " + A + "cm\u00B2");
            
            System.out.println();
            System.out.println("Would you like to do another calculation? (Enter yes/no)");
            keepgoing = scan.next();
           
            
            if(keepgoing.equals("yes")){
                go = "yes";
            }
            else{
                System.out.println();
                System.out.println("Thank you for using this calculator");
                System.out.println("Goodbye");
                go = "null";
            }
        }
    }   
    
}
