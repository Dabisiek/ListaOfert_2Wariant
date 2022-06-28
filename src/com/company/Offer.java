package com.company;

public abstract class Offer implements IOffer {
    private String localization;
    private Integer numbersOfRooms;
    private double rentalPrice;
    private String rentedProperty;

    public Offer(String localization, Integer numbersOfRooms, double rentalPrice, String rentedProperty) {
        this.localization = localization;
        this.numbersOfRooms = numbersOfRooms;
        this.rentalPrice = rentalPrice;
        this.rentedProperty = rentedProperty;
    }

    @Override
    public String toString() {
        return "Oferta" +
                "localization " + localization + "\n" +
                "numbersOfRooms " + numbersOfRooms + "\n" +
                "rentalPrice " + rentalPrice + "\n" +
                "rentedProperty " + rentedProperty + "\n";
    }

    public String getRentedProperty() {
        return rentedProperty;
    }

    public void setRentedProperty(String rentedProperty) {
        this.rentedProperty = rentedProperty;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public int getNumbersOfRooms() {
        return numbersOfRooms;
    }

    public void setNumbersOfRooms(int numbersOfRooms) {
        this.numbersOfRooms = numbersOfRooms;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
}
