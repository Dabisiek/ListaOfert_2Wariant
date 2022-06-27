package com.company;


import java.util.ArrayList;
import java.util.function.Predicate;

public class Filtering implements Predicate {

    protected final OfferList filtering;
    private Predicate<OfferList> filtr = new Predicate<>() {
        @Override
        public Predicate<OfferList> or(Predicate<? super OfferList> other) {
            return Predicate.super.or(other);
        }

        @Override
        public boolean test(OfferList offerList) {
            return false;
        }
    };

    public Filtering(OfferList filtering) {
        this.filtering = filtering;
    }

    public static void lowestPrice(OfferList offerList){
        Offer lowestPrice = offerList.stream().
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}
