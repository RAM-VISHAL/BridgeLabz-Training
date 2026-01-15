package com.ParcelTracker;

//Main class
public class ParcelApp {
 public static void main(String[] args) {
     DeliveryChain chain = new DeliveryChain();

     chain.addStage("Packed");
     chain.addStage("Shipped");
     chain.addStage("In Transit");
     chain.addStage("Delivered");

     chain.addCheckpoint("Shipped", "At Sorting Center");

     chain.track();
     chain.checkLost();
 }
}
