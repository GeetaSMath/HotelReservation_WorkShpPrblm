package com.bridgelabz;

public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to solve hotel Reservation System");

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("LakeWood", 110, 90);
        hotelReservation.addHotel("BridgeWood", 150, 50);
        hotelReservation.addHotel("RidgeWood", 220, 150);
        hotelReservation.getHotelDetails();
    }
}
