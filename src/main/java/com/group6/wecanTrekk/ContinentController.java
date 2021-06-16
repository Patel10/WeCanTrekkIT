package com.group6.wecanTrekk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    public String findAllContinents(Model model){
        model.addAttribute("continentsModel", continentRepo.findAll());
        return "continentsTemplate";
}
@RequestMapping("/continent")
public String findOneContinent(@RequestParam(value="id")Long id, Model model){
        model.addAttribute("continentModel", continentRepo.findOne(id));
        return "reviewTemplate";
}
}
