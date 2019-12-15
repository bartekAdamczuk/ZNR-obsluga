package com.example.demo.controller;

import com.example.demo.entity.OSH;
import com.example.demo.service.OSHService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class OSHController  {

    private final OSHService oshService;

    public OSHController (OSHService oshService){this.oshService = oshService;}

    @GetMapping ("/osh")
    public String getOSH(Model model){
        List<OSH> osh = oshService.getAll();
        model.addAttribute("/osh", osh);
        return "osh";
    }
}
