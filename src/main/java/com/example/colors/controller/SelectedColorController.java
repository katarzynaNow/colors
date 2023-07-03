package com.example.colors.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SelectedColorController {
    @Value("${app.title.select}")
    private String title;

    @GetMapping("/select")
    public String selectedColorPage(Model model){
        String[][] colors = {
                {"red", "blue", "purple", "teal"},
                {"black","orange", "yellow", "green"},
                {"gray","silver", "olive", "lime"},
                {"navy","white", "aqua", "fuchsia"}
        };

        model.addAttribute("title", title);
        model.addAttribute("colors", colors);
        return "select";
    }
}
