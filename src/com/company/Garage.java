package com.company;

public class Garage extends Offer {

    private int numberOfGates;

    public Garage(String localization, Integer numbersOfRooms, double rentalPrice, String rentedProperty, int numberOfGates) {
        super(localization, numbersOfRooms, rentalPrice, rentedProperty);
        this.numberOfGates = numberOfGates;
    }

    @Override
    public String toString() {
        return "Oferta" + "\n" +
                "lokalizacja " + getLocalization() + "\n" +
                "Ilość pokoi " + getNumbersOfRooms() + "\n" +
                "Cena najmu " + getRentalPrice() + "tyś." + "\n" +
                "rodzaj nieruchomości: Garaż" + "\n" +
                "Ilość bram: " + getNumberOfGates() + "\n";
    }

    public int getNumberOfGates() {
        return numberOfGates;
    }

    public void setNumberOfGates(int numberOfGates) {
        this.numberOfGates = numberOfGates;
    }
}
