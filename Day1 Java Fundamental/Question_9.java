// Create a program to convert distance in kilometers to miles.

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        double km = input.nextDouble();
        double miles = km * 0.621371;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
