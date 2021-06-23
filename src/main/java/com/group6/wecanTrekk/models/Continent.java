package com.group6.wecanTrekk.models;


import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Lob;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String img;
    @Lob private String content;

    @OneToMany(mappedBy = "continent")
    private Collection<Region> regions;

    protected Continent() {

    }
//as soon as images were put in 7 problems
    public Continent(String name, String img, String content) {
        this.name =name;
        this.img = img;
        this.content = content;

    }

    public Long getId() {

        return id;
    }

    public String getName() {
        return name;
    }
    public String getImg(){
        return img;
    }

    public String getContent(){
        return content;
    }

    public Collection<Region> getRegions() {
        return regions;
    }

   @Override
   public String toString() {
       return String.format("Continent[id=%d, name=%s, img=%s, content=%s]", id, name, img, content);
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






