package com.TrainCompanion;

public class Main {
    public static void main(String[] args) {

        TrainRoute train = new TrainRoute();

        train.addCompartment("C1", true, false);
        train.addCompartment("C2", false, true);
        train.addCompartment("C3", true, true);
        train.addCompartment("C4", false, false);

        train.displayTrain();
        train.showCurrentPosition();

        train.moveNext();
        train.moveNext();
        train.showCurrentPosition();

        train.movePrevious();

        train.removeCompartment("C3");
        train.displayTrain();
    }
}
