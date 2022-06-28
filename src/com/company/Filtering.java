package com.company;

import java.util.Comparator;

public class Filtering {

    private Integer rooms;
    private final Comparator<Offer> comparator = new Comparator<>() {
        @Override
        public int compare(Offer o1, Offer o2) {
            return Double.compare(o1.getRentalPrice(), o2.getRentalPrice());
        }
    };

    public Filtering(Integer rooms) {
        this.rooms = rooms;
    }

    public void filter(OfferList filtering) {
        filtering.getOffers().stream()
                .filter(seeking -> rooms.equals(seeking.getNumbersOfRooms()))
                .sorted(comparator)
                .limit(1)
                .forEach(System.out::println);
    }
}
