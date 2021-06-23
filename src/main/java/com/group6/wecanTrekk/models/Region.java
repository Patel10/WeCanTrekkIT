package com.group6.wecanTrekk.models;

import javax.persistence.*;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private String img;



    @Lob
    private String content;

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


   public String getImg(){
        return img;
   }

  public String getContent() {
      return content;
 }

    @Override
    public String toString() {
        return String.format("Region[id=%d, name=%s, location=%s, img=%s, content=%s, ]", id, name,location, img, content); //removed Continent continent
    }

    public Continent getContinent() {
        return continent;
    }

    protected Region() {
    }

    public Region(String name, String location, String img, String content, Continent continent) {
        this.name = name;
        this.location = location;
        this.img = img;
        this.content = content;
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

