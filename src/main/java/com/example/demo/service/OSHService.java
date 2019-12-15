package com.example.demo.service;

import com.example.demo.entity.OSH;
import com.example.demo.repository.OSHRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OSHService {
    private final OSHRepository oshRepository;

    public OSHService (OSHRepository oshRepository) {this.oshRepository=oshRepository;}

    public OSH saveOSH (OSH osh) {return oshRepository.save(osh);}

    public List<OSH> getAll() {return oshRepository.findAll();}

    public Optional<OSH> getById(Long id){return oshRepository.findById(id);}
}
