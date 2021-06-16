package com.group6.wecanTrekk;

import java.util.Collection;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ContinentRepository extends CrudRepository<Continent, Long>{

    List<Continent> findByName(String name);

    Continent findById(long id);

    Object findOne(Long id);
}