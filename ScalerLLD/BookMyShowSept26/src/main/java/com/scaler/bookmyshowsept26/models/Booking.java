package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> showSeats;

    private Date bookingDate;
    private int amount;

    @OneToMany(mappedBy = "booking")
    private List<Payment> payment;
}