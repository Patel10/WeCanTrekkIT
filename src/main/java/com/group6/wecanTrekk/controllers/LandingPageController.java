package com.group6.wecanTrekk.controllers;

import com.group6.wecanTrekk.repositories.RegionRepository;
import com.group6.wecanTrekk.repositories.TrekkRepository;
import com.group6.wecanTrekk.repositories.ContinentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller

public class LandingPageController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private RegionRepository regionRepo;
    @Resource
    private TrekkRepository trekkRepo;


    @GetMapping("/wecantrekit")
    public String wecantrekit(@RequestParam(name = "name", required = false, defaultValue = "world") String name, Model model) {
        model.addAttribute("TrekModel", trekkRepo.findAll());
        model.addAttribute("ContinentModel", continentRepo.findAll());
        return "landingpage";

    }

    @GetMapping("/contact")
    public String contact(@RequestParam(name = "contact", required = false, defaultValue = "!") String contact, Model model) {
        model.addAttribute("contact", contact);
        return "contactus";

    }

    @GetMapping("/about")
    public String about(@RequestParam(name = "about", required = false, defaultValue = "!") String about, Model model) {
        model.addAttribute("about", about);
        return "aboutUs";
    }

    @GetMapping("/continents")  //changed fromm @RequestMapping
    public String findAllContinent(Model model) {
        model.addAttribute("ContinentModel", continentRepo.findAll());
                return "continents";

    }
    @GetMapping("/continents/{id}")  //changed fromm @RequestMapping
    public String findOneContinent(Model model, @PathVariable Long id) {
        model.addAttribute("ContinentModel", continentRepo.findById(id).get());
        return "continent";

    }

    @RequestMapping("/region")
    public String displayAllRegions(Model model){
        model.addAttribute("RegionModel", regionRepo.findAll());

        return "regions";
    }
    @RequestMapping("/regions/{id}")
    public String displayOneRegion(Model model,@PathVariable Long id){
        model.addAttribute("RegionModel", regionRepo.findById(id).get());
        return "region";

    }


    @RequestMapping("/trekk")
    public String displayAllTrekks(Model model) {
        model.addAttribute("TrekkModel", trekkRepo.findAll());

        return "TrekView";

    }

}