package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen  extends BaseModel{
    private String name;
    //Screen -- Seat => 1:M
    @OneToMany(mappedBy = "screen")
    @ElementCollection
    private List<Seat> seats;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

    @ManyToOne
    private Theatre theatre;


}
