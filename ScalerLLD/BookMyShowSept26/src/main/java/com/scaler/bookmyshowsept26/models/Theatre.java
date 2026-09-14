package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="theatres")
public class Theatre  extends BaseModel{

 private String name;

@OneToMany(mappedBy = "theatre")
 private List<Screen> screens; //OneToMany

 @ManyToOne
 private City city;

}

//Theatre => Screen -> 1:M

