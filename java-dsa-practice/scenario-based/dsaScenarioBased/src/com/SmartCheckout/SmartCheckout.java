package com.SmartCheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue;
    private HashMap<String, Item> inventory;

    public SmartCheckout() {
        customerQueue = new LinkedList<>();
        inventory = new HashMap<>();
    }

    public void addItem(String name, double price, int stock) {
        inventory.put(name, new Item(price, stock));
    }

    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.getName() + " added to queue");
    }

    public void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Customer customer = customerQueue.poll();
        double total = 0;

        System.out.println("\nBilling for " + customer.getName());

        for (String itemName : customer.getItems()) {
            Item item = inventory.get(itemName);

            if (item != null && item.getStock() > 0) {
                total += item.getPrice();
                item.reduceStock();
                System.out.println(itemName + " : ₹" + item.getPrice());
            } else {
                System.out.println(itemName + " is out of stock");
            }
        }

        System.out.println("Total Bill: ₹" + total);
    }
}
