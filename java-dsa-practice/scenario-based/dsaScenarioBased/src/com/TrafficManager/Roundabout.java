package com.TrafficManager;

class Roundabout {
    private VehicleNode head = null;

    public void addVehicle(String vehicle) {
        VehicleNode newNode = new VehicleNode(vehicle);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            VehicleNode temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println(vehicle + " entered the roundabout.");
    }

    public void removeVehicle(String vehicle) {
        if (head == null) {
            System.out.println("Roundabout is empty!");
            return;
        }

        VehicleNode curr = head, prev = null;

        do {
            if (curr.vehicleNumber.equals(vehicle)) {
                if (curr == head) {
                    VehicleNode last = head;
                    while (last.next != head)
                        last = last.next;

                    if (head.next == head) {
                        head = null;
                    } else {
                        last.next = head.next;
                        head = head.next;
                    }
                } else {
                    prev.next = curr.next;
                }

                System.out.println(vehicle + " exited the roundabout.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found!");
    }

    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("🚗 Roundabout: ");
        VehicleNode temp = head;
        do {
            System.out.print(temp.vehicleNumber + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.vehicleNumber + ")");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
