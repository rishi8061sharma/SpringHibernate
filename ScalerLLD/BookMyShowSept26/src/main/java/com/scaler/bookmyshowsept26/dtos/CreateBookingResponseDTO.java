package com.scaler.bookmyshowsept26.dtos;


import com.scaler.bookmyshowsept26.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookingResponseDTO {

    private Booking booking;


    private ResponseStatus responseStatus;
}
