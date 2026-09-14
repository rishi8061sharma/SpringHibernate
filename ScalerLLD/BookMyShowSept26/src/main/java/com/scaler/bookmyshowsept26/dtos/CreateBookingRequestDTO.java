package com.scaler.bookmyshowsept26.dtos;

import com.scaler.bookmyshowsept26.models.Show;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class CreateBookingRequestDTO {
    private Long userId;

    private Long showId;

    private List<Long> showSeatId;


}
