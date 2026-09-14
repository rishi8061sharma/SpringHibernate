package com.scaler.bookmyshowsept26.services;

import com.scaler.bookmyshowsept26.models.Booking;

import java.util.List;

public class BookingService {

    public Booking createBooking(Long userId, Long showId, List<Long> showSeatIds){
        return new Booking();
    }
}
