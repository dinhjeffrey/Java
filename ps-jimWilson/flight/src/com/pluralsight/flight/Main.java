package com.pluralsight.flight;

public class Main {

    public static void main(String[] args) {
        Flight flight1 = new Flight();
        flight1.add1Passenger();
        flight1.add1Passenger();
        System.out.println(flight1.passengers);

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
    }
}
