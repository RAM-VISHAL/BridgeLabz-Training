package com.ambulanceroute;

public class AmbulanceRoute {

    private HospitalUnit head = null;

    // Add unit to circular list
    public void addUnit(String name) {
        HospitalUnit newUnit = new HospitalUnit(name);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head;
        }
        System.out.println("Unit added: " + name);
    }

    // Mark unit as unavailable
    public void setAvailability(String name, boolean status) {
        if (head == null) return;

        HospitalUnit temp = head;
        do {
            if (temp.name.equals(name)) {
                temp.available = status;
                System.out.println(name + " availability set to " + status);
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Find nearest available unit
    public HospitalUnit findNearestAvailable() {
        if (head == null) return null;

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                return temp;
            }
            temp = temp.next;
        } while (temp != head);

        return null;
    }

    // Remove unit (maintenance)
    public void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(name)) {

                if (curr == head) {
                    HospitalUnit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Unit removed for maintenance: " + name);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Simulate ambulance routing
    public void routePatient() {
        HospitalUnit unit = findNearestAvailable();
        if (unit == null) {
            System.out.println("❌ No available units for emergency!");
        } else {
            System.out.println("🚑 Patient sent to: " + unit.name);
        }
    }

    // Display all units
    public void displayUnits() {
        if (head == null) return;

        HospitalUnit temp = head;
        System.out.println("\n🏥 Hospital Units:");
        do {
            System.out.println(temp.name + " | Available: " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }
}

