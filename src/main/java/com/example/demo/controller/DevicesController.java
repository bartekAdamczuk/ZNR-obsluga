package com.example.demo.controller;

import com.example.demo.entity.Devices;
import com.example.demo.service.DevicesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DevicesController {

    private final DevicesService devicesService;

    public DevicesController(DevicesService devicesService) {
        this.devicesService = devicesService;
    }

    @GetMapping("/devices")
    public String getDevices(Model model){
        List<Devices> devices = devicesService.getAll();
        model.addAttribute("devices", devices);
        return "devices";
    }

}
