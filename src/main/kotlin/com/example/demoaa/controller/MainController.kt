package com.example.demoaa.controller

import com.example.demoaa.model.Person
import lombok.extern.slf4j.Slf4j
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @GetMapping
    @ResponseBody
    fun test(model: Model) : String {
       
        val data = Person("정재욱",27);
        data.age=20
        model["tite"] = "asd"
        model.addAttribute("data", data);
        return "test"
    }


}