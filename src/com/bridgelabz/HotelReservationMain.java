package com.bridgelabz;
import java.util.ArrayList;
import java.util.Comparator;

class HotelReservationSystemMain{
    public static void main(String[] args) {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("LakeWood", 110, 90);
        hotelReservation.addHotel("BridgeWood", 150, 50);
        hotelReservation.addHotel("RidgeWood", 220, 150);
        hotelReservation.getHotelDetails();


    }
}
