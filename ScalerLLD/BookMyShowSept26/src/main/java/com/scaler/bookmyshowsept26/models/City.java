package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="cities")
public class City extends BaseModel{

    private String name;

    @OneToMany(mappedBy = "city")
    @ElementCollection
    private List<Theatre> theatres;
}
// City --> Theatre => 1 :M
