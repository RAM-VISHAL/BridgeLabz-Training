package com.ParcelTracker;

//Linked List Manager
class DeliveryChain {
 private ParcelNode head;

 // Add stage at end
 public void addStage(String stage) {
     ParcelNode node = new ParcelNode(stage);

     if (head == null) {
         head = node;
         return;
     }

     ParcelNode temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = node;
 }

 // Add custom checkpoint after a stage
 public void addCheckpoint(String afterStage, String newStage) {
     ParcelNode temp = head;

     while (temp != null && !temp.stage.equals(afterStage)) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Stage not found!");
         return;
     }

     ParcelNode newNode = new ParcelNode(newStage);
     newNode.next = temp.next;
     temp.next = newNode;
 }

 // Display forward tracking
 public void track() {
     if (head == null) {
         System.out.println("No parcel found.");
         return;
     }

     ParcelNode temp = head;
     System.out.print("Tracking: ");

     while (temp != null) {
         System.out.print(temp.stage);
         if (temp.next != null) System.out.print(" → ");
         temp = temp.next;
     }
     System.out.println();
 }

 // Detect lost parcel (null node)
 public void checkLost() {
     ParcelNode temp = head;

     if (temp == null) {
         System.out.println("Parcel missing!");
         return;
     }

     while (temp != null) {
         if (temp.stage == null) {
             System.out.println("Parcel lost between stages!");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Parcel chain is valid.");
 }
}
