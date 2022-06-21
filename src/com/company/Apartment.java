package com.company;

public class Apartment extends Offer{

    private String furniture;

    public Apartment(String localization, Integer numbersOfRooms, double rentalPrice, String rentedProperty, String furniture) {
        super(localization, numbersOfRooms, rentalPrice, rentedProperty);
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return  "Oferta"+ "\n" +
                "lokalizacja " + getLocalization() + "\n" +
                "Ilość pokoi " + getNumbersOfRooms() + "\n" +
                "Cena najmu " + getRentalPrice()+"tyś." + "\n" +
                "rodzaj nieruchomości: Mieszkanie" + "\n" +
                "Czy posiada meble: " + getFurniture() + "\n";
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }
}
