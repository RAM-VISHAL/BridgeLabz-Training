package com.sorting.quicksort.eventmanager;

public class EventManagerApp {

    public static void main(String[] args) {

        Ticket[] tickets = {
                new Ticket(2500),
                new Ticket(1200),
                new Ticket(4999),
                new Ticket(800),
                new Ticket(3000),
                new Ticket(1500)
        };

        EventManager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("🎟 Sorted Ticket Prices:");
        for (Ticket t : tickets) {
            System.out.println("₹" + t.getPrice());
        }

        System.out.println("\nTop Cheapest Ticket: ₹" + tickets[0].getPrice());
        System.out.println("Top Expensive Ticket: ₹" + tickets[tickets.length - 1].getPrice());
    }
}
