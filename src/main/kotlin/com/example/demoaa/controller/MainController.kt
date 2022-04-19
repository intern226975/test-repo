package com.example.demoaa.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping
    fun test(model: Model) : String {
        model.addAttribute("title", "test");
        return "index"
    }


    //####
}