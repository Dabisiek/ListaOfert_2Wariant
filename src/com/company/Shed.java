package com.company;

public class Shed extends Offer{

    private String workingTable;

    public Shed(String localization, Integer numbersOfRooms, double rentalPrice, String rentedProperty, String workingTable) {
        super(localization, numbersOfRooms, rentalPrice, rentedProperty);
        this.workingTable = workingTable;
    }

    @Override
    public String toString() {
        return  "Oferta"+ "\n" +
                "lokalizacja " + getLocalization() + "\n" +
                "Ilość pokoi " + getNumbersOfRooms() + "\n" +
                "Cena najmu " + getRentalPrice()+"tyś." + "\n" +
                "rodzaj nieruchomości: Szopa" + "\n" +
                "Czy posiada stół roboczy: " + getWorkingTable() + "\n";
    }

    public String getWorkingTable() {
        return workingTable;
    }

    public void setWorkingTable(String workingTable) {
        this.workingTable = workingTable;
    }
}
