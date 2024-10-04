package com.parking.mallplaza.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Owner {
    @Id
    private long Id;
    private int numberIdentification;
    private String name;
    private String lastName;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public int getNumberIdentification() {
        return numberIdentification;
    }

    public void setNumberIdentification(int numberIdentification) {
        this.numberIdentification = numberIdentification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
