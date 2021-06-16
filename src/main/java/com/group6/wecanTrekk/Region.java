package com.group6.wecanTrekk;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name; //regionName
    private String location;

    @ManyToOne
    private Continent continent;


    public Long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getLocation() {

        return location;
    }
    @Override
    public String toString() {
        return String.format("Region[id=%d, name=%s, location=%s]", id, name,location);
    }

    protected Region() {
    }

    public Region(String name, String location, Continent continent) {
        this.name = name;
        this.location = location;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

