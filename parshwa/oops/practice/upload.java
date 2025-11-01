package parshwa.oops.practice;
import java.util.*;

public class upload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // items and prices
        String item1Name = "T-Shirt";
        double item1Price = 15.99;

        String item2Name = "Jeans";
        double item2Price = 29.99;

        String item3Name = "Shoes";
        double item3Price = 49.99;

        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();

        System.out.print("\nEnter the number of items you want to purchase: ");
        int numItems = sc.nextInt();

        double totalCostBeforeDiscount = 0.0;
        int totalQuantity = 0;

        // Variables to store purchase details for printing later
        String purchasedItems = "";
        String quantities = "";
        String costPerItemStr = "";
        String totalCostsStr = "";

        for (int i = 1; i <= numItems; i++) {
            System.out.printf("\nEnter item number %d: ", i);
            int itemCode = sc.nextInt();

            System.out.print("Enter the quantity: ");
            int quantity = sc.nextInt();

            String itemName = "";
            double itemPrice = 0.0;

            if (itemCode == 1) {
                itemName = item1Name;
                itemPrice = item1Price;
            } else if (itemCode == 2) {
                itemName = item2Name;
                itemPrice = item2Price;
            } else if (itemCode == 3) {
                itemName = item3Name;
                itemPrice = item3Price;
            } else {
                System.out.println("Invalid item code. Please enter again.");
                i--; 
                continue;
            }

            double totalItemCost = itemPrice * quantity;
            totalCostBeforeDiscount += totalItemCost;
            totalQuantity += quantity;

            
            purchasedItems += itemName + "\n";
            quantities += quantity + "\n";
            costPerItemStr += String.format("$%.2f\n", itemPrice);
            totalCostsStr += String.format("$%.2f\n", totalItemCost);
        }

        // Calculate discount
        double discountPercent = 0.0;
        if (totalQuantity >= 3 && totalCostBeforeDiscount > 80.0) {
            discountPercent = 15.0;
        } else if (totalQuantity >= 3) {
            discountPercent = 5.0;
        } else if (totalCostBeforeDiscount > 80.0) {
            discountPercent = 10.0;
        }

        double discountAmount = (discountPercent / 100.0) * totalCostBeforeDiscount;
        double finalTotalCost = totalCostBeforeDiscount - discountAmount;

        // Print receipt
        System.out.println("\nName: " + customerName);
        System.out.println("\nItem Purchased:");
        System.out.println("Item         Quantity      Cost/item         Total costs");

        // Print purchase details 
        Scanner itemScanner = new Scanner(purchasedItems);
        Scanner qtyScanner = new Scanner(quantities);
        Scanner costItemScanner = new Scanner(costPerItemStr);
        Scanner totalCostScanner = new Scanner(totalCostsStr);

        while (itemScanner.hasNextLine()) {
            String item = itemScanner.nextLine();
            String qty = qtyScanner.nextLine();
            String costItem = costItemScanner.nextLine();
            String totCost = totalCostScanner.nextLine();

            System.out.printf("%-13s %-13s %-15s %s\n", item, qty, costItem, totCost);
        }

        System.out.printf("\nTotal Cost before discount: $%.2f\n", totalCostBeforeDiscount);
        System.out.printf("Applied Discount: %.0f%%\n", discountPercent);
        System.out.printf("Discount Amount: -$%.2f\n", discountAmount);
        System.out.printf("\nFinal Total Cost: $%.2f\n", finalTotalCost);
    }
}
