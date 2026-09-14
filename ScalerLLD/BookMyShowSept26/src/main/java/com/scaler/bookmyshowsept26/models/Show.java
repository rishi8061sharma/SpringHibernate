package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name="shows")
public class Show  extends BaseModel{


    // Show -> Movie : M:1
    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;
    private Date startTime;
    private Date endTime;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature>features;

    private String language;

}
