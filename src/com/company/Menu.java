package com.company;

import java.util.Scanner;

public class Menu {

    private final Scanner input = new Scanner(System.in);
    private final OfferList offerList = new OfferList();

    public void run() {
        boolean exit = true;
        System.out.println("Program - Lista ofert wynajęcia mieszkań");
        while (exit) {
            System.out.println("1: Pokaż wszystkie oferty");
            System.out.println("2: Wyszukiwanie konkretnej oferty");
            System.out.println("3: Dodaj ofertę");
            System.out.println("4: Usuń ofertę");
            System.out.println("5: Wyjdz z programu");

            switch (input.nextInt()) {
                case 1 -> offerList.showOffers();
                case 2 -> searching(offerList);
                case 3 -> createOffer();
                case 4 -> {
                    System.out.println("Podaj numer oferty, którą chcesz usunąć");
                    deleteOffer(input.nextInt());
                }
                case 5 -> exit = false;
            }
        }
    }

    public void createOffer() {
        System.out.println("Podaj lokalizację, następnie liczbe pokoi oraz cenę najmu");
        String localization = input.next();
        int numbersOfRooms = input.nextInt();
        double rentalPrice = input.nextDouble();
        System.out.println("Wybierz rodzaj posesji: 1. Garaż, 2. Mieszkanie, 3. Szopa");
        switch (input.nextInt()) {
            case 1 -> {
                String rentedProperty = "Garage";
                System.out.println("Podaj ile garaż ma bram:");
                int gates = input.nextInt();
                Garage garage = new Garage(localization, numbersOfRooms, rentalPrice, rentedProperty, gates);
                offerList.addOffer(garage);
            }
            case 2 -> {
                String rentedProperty = "Apartment";
                System.out.println("Wpisz do programu czy mieszkanie posiada meble: 'TAK', lub 'Nie' ");
                String furniture = input.next();
                Apartment apartment = new Apartment(localization, numbersOfRooms, rentalPrice, rentedProperty, furniture);
                offerList.addOffer(apartment);
            }
            case 3 -> {
                String rentedProperty = "Shed";
                System.out.println("Wpisz do programu czy mieszkanie posiada stół roboczy: 'TAK', lub 'Nie' ");
                String table = input.next();
                Shed shed = new Shed(localization, numbersOfRooms, rentalPrice, rentedProperty, table);
                offerList.addOffer(shed);
            }
        }
    }

    public void deleteOffer(int which) {
        offerList.delOffer(which - 1);
    }

    public void searching(OfferList offerList) {
        System.out.println("Podaj liczbę pokoi, po której chcesz znaleźć najstańszą nieruchomość");
        Integer rooms = input.nextInt();
        Filtering filtering = new Filtering(rooms);
        filtering.filter(offerList);
    }
}