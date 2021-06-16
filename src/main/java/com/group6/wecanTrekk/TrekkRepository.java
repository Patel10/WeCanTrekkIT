package com.group6.wecanTrekk;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TrekkRepository extends CrudRepository<Trekk, Long> {

    Optional<Trekk> findById(Long id);
}
