// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate thetotal purchase price.

import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price of an item: ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();
        double totalPurchasePrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPurchasePrice + " if the quantity is " + quantity
                + " and the unit price is INR " + unitPrice);
        sc.close();
    }
}
