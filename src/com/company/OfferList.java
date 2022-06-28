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

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }
}
