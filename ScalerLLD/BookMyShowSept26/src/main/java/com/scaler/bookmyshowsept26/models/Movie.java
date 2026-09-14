package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="movies")
public class Movie extends BaseModel {

    private String title;
    private double duration;
    private double rating;

    @Enumerated
    @ElementCollection
    private List<Feature> features;


    private List<String> languages;

}
