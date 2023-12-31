package com.example.colors.controller;

import com.example.colors.service.SelectedColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

    @Value("${app.title.data}")
    private String title;

    @Autowired
    SelectedColorService selectedColorService;

    @GetMapping("/data")
    String dataPage(Model model){
        model.addAttribute("title", title);
        model.addAttribute("selectedColors", selectedColorService.getAllData());
        return "data";
    }
}
