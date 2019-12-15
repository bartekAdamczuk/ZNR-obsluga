package com.example.demo.controller;

import com.example.demo.entity.Warehouse;
import com.example.demo.service.WarehouseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService){this.warehouseService = warehouseService;}



    @GetMapping("/warehouse")
    public String getWorkers(Model model){
        List<Warehouse> warehouses = warehouseService.getAll();
        model.addAttribute("warehouse", warehouses);
        return "warehouse";
    }
}
