package com.example.demo.service;

import com.example.demo.entity.Tool;
import com.example.demo.repository.ToolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToolService {
    private final ToolRepository toolRepository;

    public ToolService(ToolRepository toolsRepository){this.toolRepository = toolsRepository;}

    public Tool saveTools (Tool tools) {return toolRepository.save(tools);}

    public List<Tool> getAll(){return toolRepository.findAll();}

    public Optional<Tool> getById(Long id){
        return toolRepository.findById(id);
    }


}
