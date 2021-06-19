package com.group6.wecanTrekk.repositories;

import com.group6.wecanTrekk.models.Trekk;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekkRepository extends CrudRepository<Trekk, Long> {

    Optional<Trekk> findById(Long id);
}
