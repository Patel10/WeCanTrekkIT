package com.group6.wecanTrekk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class LandingPageController {

    @GetMapping("/wecantrekit")
    public String wecantrekit(@RequestParam(name="name", required = false, defaultValue="world") String name, Model model){
        model.addAttribute("name", name);
        return "landingpage";

    }
}
