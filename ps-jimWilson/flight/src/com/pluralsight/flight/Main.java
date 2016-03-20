package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        Flight lax3 = null; // null is a reference literal. It represents an uncreated object

        for (int i=0; i<148; i++){
            lax1.add1Passenger();
        }
        lax2.add1Passenger();


        if (lax1.hasRoom(lax2)) {
            lax3 = lax1.createNewWithBoth(lax2);
            System.out.println("seats: " + lax3.seats);
            System.out.println("passengers: " + lax3.passengers);
        } else {
            System.out.println("Doesn't have room. lax1 + lax2 passengers is greater than lax1 seats (150)");
        }

        if (lax3 != null)
            System.out.println("Flight combined!");
        else
            System.out.println("Flights not combined.");

        // properly hiding data so it allows us to access it without impacting other code that uses that class
        Flight accessorsAndMutators = new Flight();
        accessorsAndMutators.setSeats(123);
        System.out.println(accessorsAndMutators.getSeats());

        // Passenger class. Learning constructors
        Passenger fred = new Passenger(1);
        System.out.println(fred.perBagFee);



        /* adding 1 passenger
        Flight flight1 = new Flight();
        flight1.add1Passenger();
        flight1.add1Passenger();
        System.out.println(flight1.passengers);
        */

    }

    public static class Flight {
        private int passengers;
        private int seats;

        public Flight() {
            seats = 150;
            passengers = 0;
        }

        public void add1Passenger() {
            if (passengers < seats)
                passengers += 1;
            else
                handleTooMany();
        }

        private void handleTooMany() {
            System.out.println("Too many");
        }

        public boolean hasRoom(Flight f2) {
            // first passengers is passengers from lax1 if called like this lax1.hasRoom(lax2)
            // 'this' keyword is an implicit reference to the current object lax1
            int total = this.passengers + f2.passengers;
            return total <= this.seats;
        }

        public Flight createNewWithBoth (Flight f2) {
            Flight newFlight = new Flight();
            newFlight.seats = seats;
            newFlight.passengers = passengers + f2.passengers;
            return newFlight;
        }

        public int getSeats() {
            return seats;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

    }
}
