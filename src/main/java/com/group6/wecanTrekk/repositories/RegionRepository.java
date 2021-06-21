package com.group6.wecanTrekk.repositories;

import com.group6.wecanTrekk.models.Region;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;


public interface RegionRepository extends CrudRepository<Region, Long>{

    List<Region> findByName(String name);
Region findById(long id);


}

