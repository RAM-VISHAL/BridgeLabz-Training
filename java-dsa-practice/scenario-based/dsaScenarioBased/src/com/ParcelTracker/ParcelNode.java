package com.ParcelTracker;

//Node class
class ParcelNode {
 String stage;
 ParcelNode next;

 public ParcelNode(String stage) {
     this.stage = stage;
     this.next = null;
 }
}
