package com.group6.wecanTrekk;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RegionRepository extends CrudRepository<Region, Long>{

    List<Region> findByName(String name);
Region findById(long id);


}


