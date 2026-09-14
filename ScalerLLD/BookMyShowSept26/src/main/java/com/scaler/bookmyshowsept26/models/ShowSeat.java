package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat  extends BaseModel{

    //ShowSeat --> Show   :    M:1
    @ManyToOne
    private Show show;

    //ShowSeat --> Seat :    M:1
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;


    @ManyToOne
    private Booking booking;



}


// XY ----------> X: M:1
//XY  ---------> Y: M:1