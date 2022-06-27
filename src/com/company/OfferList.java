package com.company;

import java.util.ArrayList;
import java.util.List;

public class OfferList {

    protected List<Offer> offers = new ArrayList<>();

    public OfferList() {
    }

    public void showOffers() {
        int counter = 0;
        for (Offer offer : offers) {
            counter++;
            System.out.print(counter + " ");
            System.out.println(offer);
        }
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
    }

    public void delOffer(int which) {
        offers.remove(which);
    }

    //public String search() {
    //    System.out.println("Podaj liczbę pokoi, dzięki której chcesz znalezc najtańsze mieszkanie");
    //    Integer howManyRooms = input.nextInt();
    //    double minPrice = offers.get(0).getRentalPrice();
    //    int index = 0;
//
    //   for (int i = 0; i < offers.size(); i++) {
    //       if (howManyRooms.equals(offers.get(i).getNumbersOfRooms())) {
    //           if (minPrice > offers.get(i).getRentalPrice()) {
    //               minPrice = offers.get(i).getRentalPrice();
    //                index = i;
    //           }
    //       }
    //    }
    //    return offers.get(index).toString();
    //}

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }
}
