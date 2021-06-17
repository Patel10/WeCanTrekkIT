package com.group6.wecanTrekk;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Objects;

@Entity
public class Trekk {

    @Id
    @GeneratedValue
    private Long id;


    private String trekkName;
    private String location;
    private String region;
    private String level;
    private String cost;
    private String img;
    @Lob
    private String content;


    public Trekk( String trekkName, String location, String region, String level, String cost, String img, String content) {
        //this.id = id;
        this.trekkName = trekkName;
        this.location = location;
        this.region = region;
        this.level = level;
        this.cost = cost;
        this.img = img;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTrekkName() {
        return trekkName;
    }

    public String getLocation() {
        return location;
    }

    public String getRegion() {
        return region;
    }

    public String getLevel() {
        return level;
    }

    public String getCost() {
        return cost;
    }

    public String getImg() {
        return img;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trekk trekk = (Trekk) o;
        return Objects.equals(id, trekk.id) && Objects.equals(trekkName, trekk.trekkName) && Objects.equals(location, trekk.location) && Objects.equals(region, trekk.region) && Objects.equals(level, trekk.level) && Objects.equals(cost, trekk.cost) && Objects.equals(img, trekk.img) && Objects.equals(content, trekk.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trekkName, location, region, level, cost, img, content);
    }

    protected Trekk(){}
    
    
    
}
