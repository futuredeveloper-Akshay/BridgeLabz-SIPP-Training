// CP - Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the
// temperature in Celsius
// Hint =>
// 1. Create a fahrenheit variable and take the user's input
// 2. User the formulae to convert Fahrenheit to Celsius: (°F - 32) x 5/9 = °C and assign the result to
// celsiusResult and print the result
// I/P => fahrenheit
// O/P => The ____ fahrenheit is _____ celsius


import java.util.*;
public class problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}
