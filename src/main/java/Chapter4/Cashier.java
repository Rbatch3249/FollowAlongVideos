package Chapter4;

import java.util.Scanner;

/*
for loop
write a cashier program that will scan a given number of items and tally the cose.
 */
public class Cashier {
    public static void main(String[] args) {
        //get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        scanner.close();

        double total = 0;
        //Create lop[ to iterate through all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.radix();
            total = total + price;

        }
        scanner.close();
        System.out.println("Your total is $" + total);
    }
}
