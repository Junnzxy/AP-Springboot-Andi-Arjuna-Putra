package com.example.portfolio.controller;

import com.example.portfolio.model.Photographer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        Photographer photographer = new Photographer(
            "Andi Arjuna",
            "Landscape, Portrait, Street, Event",
            5,
            "\"My eyes are colorblind, but my camera isn't\"",
            "/images/profile.jpg"
        );
        
        model.addAttribute("photographer", photographer);
        
        String[] cameraGear = {
            "FujiFilm X-H1",
            "Lens 16-35mm f/2.8"
        };
        model.addAttribute("cameraGear", cameraGear);
        
        return "index";
    }
}