package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {

      private String seatNumber;

      @Column(name = "seat_row_number")
      private int rowNumber;

      private int colNumber;

      @ManyToOne
      private SeatType seatType;

      @ManyToOne
      private Screen screen;
}