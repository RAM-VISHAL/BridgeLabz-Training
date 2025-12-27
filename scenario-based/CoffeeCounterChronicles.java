import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        // Variables and literals
        final double GST_RATE = 0.05; // 5% GST
        Scanner scanner = new Scanner(System.in);

        // Coffee menu with prices
        String[] coffeeTypes = {"Espresso", "Latte", "Cappuccino", "Mocha"};
        double[] coffeePrices = {100.0, 150.0, 120.0, 180.0};

        System.out.println("Welcome to Ravi's Café!");
        System.out.println("Menu:");
        for (int i = 0; i < coffeeTypes.length; i++) {
            System.out.println((i + 1) + ". " + coffeeTypes[i] + " - ₹" + coffeePrices[i]);
        }

        // While loop to serve multiple customers
        while (true) {
            System.out.print("\nEnter coffee type (or type 'exit' to stop): ");
            String coffeeChoice = scanner.nextLine();

            // Exit condition
            if (coffeeChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break; // Control flow: break
            }

            double price = 0.0;
            boolean validChoice = true;

            // Switch for coffee type selection
            switch (coffeeChoice.toLowerCase()) {
                case "espresso":
                    price = coffeePrices[0];
                    break;
                case "latte":
                    price = coffeePrices[1];
                    break;
                case "cappuccino":
                    price = coffeePrices[2];
                    break;
                case "mocha":
                    price = coffeePrices[3];
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    validChoice = false;
                    continue; // Control flow: continue
            }

            if (validChoice) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline

                // Arithmetic operators
                double total = price * quantity;
                double gstAmount = total * GST_RATE;
                double finalBill = total + gstAmount;

                // Ternary operator for discount example
                String discountMessage = (quantity >= 5) ? "You get a bulk discount!" : "No discount applied.";

                // Output
                System.out.println("Bill Details:");
                System.out.println("Coffee: " + coffeeChoice);
                System.out.println("Quantity: " + quantity);
                System.out.println("Price per cup: ₹" + price);
                System.out.println("Total (without GST): ₹" + total);
                System.out.println("GST (5%): ₹" + gstAmount);
                System.out.println("Final Bill: ₹" + finalBill);
                System.out.println(discountMessage);
            }
        }

        // Example of do-while loop (extra feature)
        int counter = 0;
        do {
            System.out.println("Café closing countdown: " + (3 - counter));
            counter++;
        } while (counter < 3);

        // Example of for-each loop
        System.out.println("\nCoffee types available:");
        for (String coffee : coffeeTypes) {
            System.out.println("- " + coffee);
        }

        scanner.close();
    }
}