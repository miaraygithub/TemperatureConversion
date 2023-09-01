import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) { //Creates a new method named 'main' to run all our code in
        double fahrenheitIn; //Establishing a double type variable to store the inputted Fahrenheit value
        double celsiusOut; //Establishing a double type variable to store the outputted Celsius value
        Scanner tempScanner = new Scanner(System.in); //Creates a new scanner object named tempScanner

        System.out.print("Please enter a temperature in Fahrenheit: "); // Prompt the user to enter a temperature
        fahrenheitIn = tempScanner.nextDouble(); //capture and store the next double that the user types
        celsiusOut = (fahrenheitIn - 32) * ((double) 5 / 9); //Perform the conversion from C to F, and update the celsiusOut variable

        System.out.println("That temperature in Celsius is: " + celsiusOut + " Degrees."); //Output the temp to terminal in C
        System.out.println("That temperature in Kelvin is: " + (celsiusOut - 273.15) + " Kelvin."); //Output the temp to terminal in K
    }
}
