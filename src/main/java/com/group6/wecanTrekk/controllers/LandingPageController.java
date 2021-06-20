package com.group6.wecanTrekk.controllers;

import com.group6.wecanTrekk.repositories.RegionRepository;
import com.group6.wecanTrekk.repositories.TrekkRepository;
import com.group6.wecanTrekk.repositories.ContinentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String wecantrekit(@RequestParam(name="name", required = false, defaultValue="world") String name, Model model){
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
<<<<<<< HEAD:src/main/java/com/group6/wecanTrekk/LandingPageController.java
    public String about( Model model) {
        model.addAttribute("TrekModel", trekkRepo.findAll());
        model.addAttribute("ContinentModel", continentRepo.findAll());
=======
    public String about(@RequestParam(name = "about", required = false, defaultValue = "!") String about, Model model) {
        model.addAttribute("about", about);
>>>>>>> 4af9e533775b6cbde943d4baa4adcd10d66bd7a5:src/main/java/com/group6/wecanTrekk/controllers/LandingPageController.java
        return "aboutUs";

    }
}
