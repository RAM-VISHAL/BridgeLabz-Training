package com.birdsanctuary;

import java.util.Scanner;

public class BirdScentuaryMain {

    public static void main(String[] args) {

        Sanctuary sanctuary = new Sanctuary();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Delete Bird by ID");
            System.out.println("6. Sanctuary Report");
            System.out.println("7. Developer Info");
            System.out.println("8. Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sanctuary.addBird(new Duck("B101", "Daffy"));
                    sanctuary.addBird(new Eagle("B102", "Rocky"));
                    sanctuary.addBird(new Penguin("B103", "Pingu"));
                    sanctuary.addBird(new Ostrich("B104", "Oscar"));
                    sanctuary.addBird(new Seagull("B105", "Sky"));
                    break;

                case 2:
                    sanctuary.displayAll();
                    break;

                case 3:
                    sanctuary.displayFlyingBirds();
                    break;

                case 4:
                    sanctuary.displaySwimmingBirds();
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    sanctuary.removeById(sc.next());
                    break;

                case 6:
                    sanctuary.sanctuaryReport();
                    break;

                case 7:
                    sanctuary.showDeveloperInfo();
                    break;

                case 8:
                    System.out.println("Thank you for protecting wildlife 🐦");
                    return;
            }
        }
    }
}
