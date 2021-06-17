package com.group6.wecanTrekk.controllers;

import com.group6.wecanTrekk.repositories.ContinentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    public String findAllContinents(Model model){
        model.addAttribute("continentsModel", continentRepo.findAll());
        return "continentsTemplate";
}
@RequestMapping("/continent/{id}")
public String findOneContinent(Model model, @PathVariable Long id){
        model.addAttribute("continentModel", continentRepo.findOne(id));
        return "continentTemplate";
}
}

