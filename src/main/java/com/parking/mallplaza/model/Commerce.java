package com.parking.mallplaza.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.LocalDateTime;
import java.util.Date;

@Node
public class Commerce {

    @Id
    private long Id;
    private String nameCommerce;
    private Vehicule vehicule;
    private LocalDateTime timeIngress = LocalDateTime.now();

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNameCommerce() {
        return nameCommerce;
    }

    public void setNameCommerce(String nameCommerce) {
        this.nameCommerce = nameCommerce;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public LocalDateTime getTimeIngress() {
        return timeIngress;
    }

}
