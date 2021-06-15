package com.group6.wecanTrekk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WecanTrekkApplication {


    private static final Logger log = LoggerFactory.getLogger(WecanTrekkApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WecanTrekkApplication.class, args);
    }

    @Bean
    public CommandLineRunner makeContinents(ContinentRepository repository) {
        return (args) -> {
//do I need this since we are building a front end?
            repository.save(new Continent("Africa"));
            repository.save(new Continent("Antarctica"));
            repository.save(new Continent("Asia"));
            repository.save(new Continent("Australia"));
            repository.save(new Continent("Europe"));
            repository.save(new Continent("North America"));
            repository.save(new Continent("South America"));


            log.info("Continents found with findAll():");
            log.info("--------------------------------");
            for (Continent continent : repository.findAll()) {
                log.info(continent.toString());
            }
            log.info("");

            Continent continent = repository.findById(1L);
            log.info("Continent found with findById(1L):");
            log.info("----------------------------------");
            log.info(continent.toString());
            log.info("");

        };
    }
@Bean
        public CommandLineRunner makeRegions(RegionRepository repository){
            return (args) -> {
                repository.save(new Region("Northern Africa", "Africa"));
                repository.save(new Region("Western Africa", "Africa"));
                repository.save(new Region("Antarctic Peninsula", "Antarctica"));
                repository.save(new Region("Ross Sea", "Antarctica"));
                repository.save(new Region("South Asia", "Asia"));
                repository.save(new Region("East Asia", "Asia"));
                repository.save(new Region("New South Wales", "Australia"));
                repository.save(new Region("Victoria", "Australia"));
                repository.save(new Region("Eastern Europe", "Europe"));
                repository.save(new Region("Western Europe", "Europe"));
                repository.save(new Region("Canadian Shield", "North America"));
                repository.save(new Region("Rocky Mountains", "North America"));
                repository.save(new Region("Gran Columbia", "South America"));
                repository.save(new Region("Gaucho", "South America"));

                log.info("Regions found with findAll():");
                log.info("--------------------------------");
                for (Region region : repository.findAll()) {
                    log.info(region.toString());
                }
                log.info("");

                Region region = repository.findById(8L);
                log.info("Region found with findById(8L):");
                log.info("----------------------------------");
                log.info(region.toString());
                log.info("");

            };
        }
    }
