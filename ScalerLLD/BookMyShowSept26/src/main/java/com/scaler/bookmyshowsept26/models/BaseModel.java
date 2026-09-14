package com.scaler.bookmyshowsept26.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO INCREAMENT
    private Long id;
    private Date createdDate;
    private Date lastModified;
}

//MappedSuperClass
// BaseModel - no need to create a table in the db
// but all attribute of BeanModels needs to be present
// in all the child class tables in the database