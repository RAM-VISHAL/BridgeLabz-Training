package com.TrainCompanion;

public class TrainRoute {

    private Compartment head;
    private Compartment tail;
    private Compartment current;

    // Add new compartment at end
    public void addCompartment(String name, boolean pantry, boolean wifi) {
        Compartment newComp = new Compartment(name, pantry, wifi);

        if (head == null) {
            head = tail = current = newComp;
        } else {
            tail.next = newComp;
            newComp.prev = tail;
            tail = newComp;
        }
        System.out.println("Compartment added: " + name);
    }

    // Move forward
    public void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved to: " + current);
        } else {
            System.out.println("No next compartment");
        }
    }

    // Move backward
    public void movePrevious() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved to: " + current);
        } else {
            System.out.println("No previous compartment");
        }
    }

    // Remove a compartment
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {

                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                }
                if (temp == tail) {
                    tail = temp.prev;
                    if (tail != null) tail.next = null;
                }
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;

                System.out.println("Compartment removed: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    // Display current and adjacent
    public void showCurrentPosition() {
        if (current == null) return;

        System.out.println("\n🚆 You are in: " + current);
        if (current.prev != null)
            System.out.println("⬅ Previous: " + current.prev.name);
        if (current.next != null)
            System.out.println("➡ Next: " + current.next.name);
    }

    // Display full route
    public void displayTrain() {
        Compartment temp = head;
        System.out.println("\nTrain Compartments:");
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
