package com.group6.wecanTrekk;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class TrekkController {
    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;
    @Resource
    private TrekkRepository trekkRepo;


    @RequestMapping("/trek")
    public String displayAllTrekks (Model model){
        model.addAttribute("TrekkModel",trekkRepo.findAll());
        model.addAttribute("RegionsModel",regionRepo.findAll());
        model.addAttribute("ContinentModel", continentRepo.findAll());
        return "trekView";

    }
}
