package com.example.demo.service;

import com.example.demo.entity.Tool;
import com.example.demo.repository.ToolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToolService {
    private final ToolRepository toolRepository;

    public ToolService(ToolRepository toolRepository){this.toolRepository = toolRepository;}

    public Tool saveTool (Tool tool) {return toolRepository.save(tool);}

    public List<Tool> getAll(){return toolRepository.findAll();}

    public Optional<Tool> getById(Long id){
        return toolRepository.findById(id);
    }


}
