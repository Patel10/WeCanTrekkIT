package com.group6.wecanTrekk.controllers;


import com.group6.wecanTrekk.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegionController {
    @Resource
    private RegionRepository regionRepo;

    public String findAllRegions(Model model) {
        model.addAttribute("regionsModel", regionRepo.findAll());
        return "regionsTemplate";

    }
    @RequestMapping("/region/{id}")
    public String findOneRegion(Model model, @PathVariable Long id){
        model.addAttribute("regionModel", regionRepo.findAll());
        return "regionView"; //was regionTemplate
    }
}
