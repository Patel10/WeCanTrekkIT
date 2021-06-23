package com.group6.wecanTrekk.repositories;

import java.util.List;

import com.group6.wecanTrekk.models.Continent;
import org.springframework.data.repository.CrudRepository;

public interface ContinentRepository extends CrudRepository<Continent, Long>{

    List<Continent> findByName(String name);

    Continent findById(long id);



}