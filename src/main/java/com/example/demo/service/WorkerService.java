package com.example.demo.service;

import com.example.demo.entity.Worker;
import com.example.demo.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public Worker saveWorker(Worker worker){
        return workerRepository.save(worker);
    }

    public List<Worker> getAll(){ return workerRepository.findAll();}

    public Optional<Worker> getById(Long id){
        return workerRepository.findById(id);
    }
}
