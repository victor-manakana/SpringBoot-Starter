package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class streets {
    @GetMapping("/demo")
    public String goBigO(Model model) {
        String[] streets = {"Vilakazi", "Sifaka", "Thabo Mbeki"};
        model.addAttribute("streets", streets);
        //model.addAttribute(streets);

        for (String streetName : streets) {
            System.out.println(streetName);
        }

        return "demo";
    }
}


