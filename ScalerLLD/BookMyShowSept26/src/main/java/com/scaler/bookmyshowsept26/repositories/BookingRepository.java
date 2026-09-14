package com.scaler.bookmyshowsept26.repositories;

import com.scaler.bookmyshowsept26.models.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingStatus, Long> {
}
