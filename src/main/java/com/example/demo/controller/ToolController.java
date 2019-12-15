package com.example.demo.controller;

import com.example.demo.entity.Tool;
import com.example.demo.service.ToolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ToolController {
    private final ToolService toolService;

    public ToolController(ToolService toolsService){this.toolService = toolsService;}



    @GetMapping("/tool")
    public String getTool(Model model){
        List<Tool> tool = toolService.getAll();
        model.addAttribute("tool", tool);
        return "tool";
    }
}
