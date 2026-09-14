package com.scaler.bookmyshowsept26.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType  extends BaseModel{

    //ShowSeatType   ------------> Show:  M:1
    @ManyToOne
    private Show show;

    //ShowSeatType   ------------> SeatType:  M:1
    @ManyToOne
    private SeatType seatType;

    private int price;
}
