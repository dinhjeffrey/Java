package com.pluralsight.flight;

/**
 * Created by Jeffrey on 3/19/16.
 */
public class Passenger {
    // fields
    int freeBags;
    int checkedBags;
    double perBagFee;

    public Passenger() {

    }

    public Passenger(int freeBags) {
        // ************* not sure how the statement below assigns value to perBagFee ********************
        // this(double) = passenger(double
        this(freeBags > 1 ? 25.0 : 50.0);
        this.freeBags = freeBags;

    }

    public Passenger(int freeBags, int checkedBags) {
        this.freeBags = freeBags;
        this.checkedBags = checkedBags;
    }

    // can declare the constructor below with 1 parameter because it has a double, not int since int is already declared
    private Passenger(double perBagFee){
        this.perBagFee = perBagFee;
    }

}
