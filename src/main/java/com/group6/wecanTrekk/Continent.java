package com.group6.wecanTrekk;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "continent")
    private Collection<Region> regions;

  protected Continent() {

    }

    public Continent(String name) {
      this.name =name;
    }

     public Long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Region> getRegions() {
        return regions;
    }

    @Override
    public String toString() {
    return String.format("Continent[id=%d, name=%s]", id, name);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id);
    }

    @Override
    public int hashCode() {

    return Objects.hash(id);
    }
}





